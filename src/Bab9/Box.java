package Bab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Box extends Frame{

    Label LbJudul, LbTugas, LbKuis, LbUts, LbUas, LbHasil;
    JRadioButton RbAsd, RbPl, RbMatkomlan, RbProbstat;
    TextField TxtTugas, TxtKuis, TxtUts, TxtUas, TxtHasil;
    String Asd, Pemlan, Matkomlan, Probstat;
    Button BtnHasil, BtnShow;
    ButtonGroup Btn;
    TextArea TBox;
    int Tugas, Kuis, UTS, UAS;
    
    public Box() {
        setLayout(null);

        LbJudul = new Label("Score Calculactor");
        LbJudul.setFont(new Font("Arial", 1, 12));
        add(LbJudul);
        LbJudul.setBounds(200, 60, 170, 20);
        
        Btn = new ButtonGroup();
        RbAsd = new JRadioButton("ASD", false);
        this.add(RbAsd).setBounds(80, 90, 60, 30);
        RbAsd.addItemListener(new mainAction());
        Btn.add(RbAsd);

        RbPl = new JRadioButton("Pemlan", false);
        this.add(RbPl).setBounds(150, 90, 80, 30);
        RbPl.addItemListener(new mainAction());
        Btn.add(RbPl);

        RbMatkomlan = new JRadioButton("Matkomlan", false);
        this.add(RbMatkomlan).setBounds(240, 90, 90, 30);
        RbMatkomlan.addItemListener(new mainAction());
        Btn.add(RbMatkomlan);

        RbProbstat = new JRadioButton("Probstat", false);
        this.add(RbProbstat).setBounds(345, 90, 80, 30);
        RbProbstat.addItemListener(new mainAction());
        Btn.add(RbProbstat);
        
        
    }
    
     class mainAction implements ActionListener, ItemListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Tugas = Integer.parseInt(TxtTugas.getText().trim());
            Kuis = Integer.parseInt(TxtKuis.getText().trim());
            UTS = Integer.parseInt(TxtUts.getText().trim());
            UAS = Integer.parseInt(TxtUas.getText().trim());
            if (e.getSource() == BtnHasil) {
                if (RbPl.isSelected()) {
                    Pemlan = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (UTS * 0.2) + (UAS * 0.3));
                    TxtHasil.setText(Pemlan);
                } else if (RbAsd.isSelected()) {
                    Asd = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (UTS * 0.2) + (UAS * 0.3));
                    TxtHasil.setText(Asd);
                } else if (RbMatkomlan.isSelected()) {
                    Matkomlan = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (UTS * 0.2) + (UAS * 0.3));
                    TxtHasil.setText(Matkomlan);
                } else if (RbProbstat.isSelected()) {
                    Probstat = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (UTS * 0.2) + (UAS * 0.3));
                    TxtHasil.setText(Probstat);
                }
            }
            if (e.getSource() == BtnShow) {
                TBox.setText("\t          College Score\n\n"
                        + "ASD\t\t   : " + Asd
                        + "\nPemograman Lanjut\t   : " + Pemlan
                        + "\nMatematika Komputasi Lanjut : " + Matkomlan
                        + "\nProbstat\t\t   : " + Probstat);
            }
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

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
        
        LbTugas = new Label("Duty");
        add(LbTugas);
        LbTugas.setBounds(170, 130, 62, 20);

        TxtTugas = new TextField("0");
        add(TxtTugas);
        TxtTugas.setBounds(270, 130, 60, 20);

        LbKuis = new Label("Quiz");
        add(LbKuis);
        LbKuis.setBounds(170, 170, 70, 20);

        TxtKuis = new TextField("0");
        add(TxtKuis);
        TxtKuis.setBounds(270, 170, 60, 20);

        LbUts = new Label("Mid Test");
        add(LbUts);
        LbUts.setBounds(170, 210, 70, 20);

        TxtUts = new TextField("0");
        add(TxtUts);
        TxtUts.setBounds(270, 210, 60, 20);

        LbUas = new Label("UAS");
        add(LbUas);
        LbUas.setBounds(170, 250, 70, 20);

        TxtUas = new TextField("0");
        add(TxtUas);
        TxtUas.setBounds(270, 250, 60, 20);

        LbHasil = new Label("Result");
        add(LbHasil);
        LbHasil.setBounds(170, 290, 70, 20);

        TxtHasil = new TextField("0");
        add(TxtHasil);
        TxtHasil.setBounds(270, 290, 60, 20);

        TBox = new TextArea();
        add(TBox);
        TBox.setBounds(70, 350, 350, 200);

        BtnHasil = new Button("Count");
        add(BtnHasil);
        BtnHasil.setBounds(200, 320, 100, 20);

        BtnShow = new Button("Show Score");
        add(BtnShow);
        BtnShow.setBounds(170, 600, 150, 30);

        BtnHasil.addActionListener(new mainAction());
        BtnShow.addActionListener(new mainAction());
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
            TxtTugas.setText("0");
            TxtKuis.setText("0");
            TxtUts.setText("0");
            TxtUas.setText("0");
            TxtHasil.setText("0");
        }
    }
}
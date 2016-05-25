package tugasgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Frame1 extends JFrame {

    String hASD, hPemlan, hMatkomlan, hProbstat;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    ButtonGroup cbg;
    JRadioButton cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHitung, btnHasil;
    TextArea txaHasil;

    public Frame1() {
        setLayout(null);

        //membuat judul
        lbJudul = new Label("Hitung Nilai Akhir Felix");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        //membuat checkbox
        cbASD = new JRadioButton("ASD", false);
        this.add(cbASD).setBounds(20, 70, 50, 20);
        cbPemlan = new JRadioButton("Pemlan",false);
        this.add(cbPemlan).setBounds(80, 70, 70, 20);
        cbMatkomlan = new JRadioButton("Matkomlan",false);
        this.add(cbMatkomlan).setBounds(160, 70, 90, 20);
        cbProbstat = new JRadioButton("Probstat",  false);
        this.add(cbProbstat).setBounds(260, 70, 90, 20);
        
        //membuat group untuk checkbox
        cbg = new ButtonGroup();
        cbg.add(cbASD);
        cbg.add(cbPemlan);
        cbg.add(cbMatkomlan);
        cbg.add(cbProbstat);

        //pilih check box akan setnol semua texfield nilai
        cbASD.addItemListener(new mainAction());
        cbPemlan.addItemListener(new mainAction());
        cbMatkomlan.addItemListener(new mainAction());
        cbProbstat.addItemListener(new mainAction());

        //membuat label dan text field
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 110, 60, 20);
        txtTugas = new TextField();
        add(txtTugas);
        txtTugas.setBounds(200, 110, 60, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 140, 70, 20);
        txtKuis = new TextField();
        add(txtKuis);
        txtKuis.setBounds(200, 140, 60, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 170, 70, 20);
        txtUTS = new TextField();
        add(txtUTS);
        txtUTS.setBounds(200, 170, 60, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 200, 70, 20);
        txtUAS = new TextField();
        add(txtUAS);
        txtUAS.setBounds(200, 200, 60, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 230, 70, 20);
        txtHasil = new TextField();
        add(txtHasil);
        txtHasil.setBounds(200, 230, 60, 20);

        //membuat button hitung
        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(130, 270, 100, 20);
        btnHitung.addActionListener(new KlikHitung());
        
        //membuat textarea
        txaHasil = new TextArea();
        add(txaHasil);
        txaHasil.setBounds(30, 310, 300, 150);
        
        //membuat button untuk hasil
        btnHasil = new Button("Tampilkan nilai semua matkul");
        add(btnHasil);
        btnHasil.setBounds(60, 470, 234, 20);
        btnHasil.addActionListener(new KlikHitung());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class KlikHitung implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {

            double tugas = Double.parseDouble(txtTugas.getText().trim());
            double kuis = Double.parseDouble(txtKuis.getText().trim());
            double UTS = Double.parseDouble(txtUTS.getText().trim());
            double UAS = Double.parseDouble(txtUAS.getText().trim());

            //jika klik hitung
            if (e.getSource() == btnHitung) {
                if (cbASD.isSelected()) {
                    hASD = String.valueOf(tugas * 0.1 + kuis * 0.2 + UTS * 0.3 + UAS * 0.4);
                    txtHasil.setText(hASD);
                } else if (cbMatkomlan.isSelected()) {
                    hMatkomlan = String.valueOf(tugas * 0.1 + kuis * 0.2 + UTS * 0.3 + UAS * 0.4);
                    txtHasil.setText(hMatkomlan);
                } else if (cbPemlan.isSelected()) {
                    hPemlan = String.valueOf(tugas * 0.1 + kuis * 0.2 + UTS * 0.3 + UAS * 0.4);
                    txtHasil.setText(hPemlan);
                } else if (cbProbstat.isSelected()) {
                    hProbstat = String.valueOf(tugas * 0.1 + kuis * 0.2 + UTS * 0.3 + UAS * 0.4);
                    txtHasil.setText(hProbstat);
                }
            }

            //jika klik tampilkan
            if (e.getSource() == btnHasil) {
                txaHasil.setText("NAMA : FELIX\n"
                        + "HASIL SEMUA NILAI MATA KULIAH\n"
                        + "\nPemlan \t\t: " + hPemlan 
                        + "\nASD \t\t: " + hASD
                        + "\nMatkomlan \t: " + hMatkomlan
                        + "\nProbstat \t: " + hProbstat);
            }
        }
    }

    class mainAction implements ItemListener {

        //jika klik salah satu check box maka akan set nol semua
        @Override
        public void itemStateChanged(ItemEvent e) {
            txtTugas.setText("0");
            txtKuis.setText("0");
            txtUTS.setText("0");
            txtUAS.setText("0");
            txtHasil.setText("0");
        }
    }
}

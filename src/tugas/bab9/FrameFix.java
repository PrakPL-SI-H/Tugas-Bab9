package Bab9;

import java.awt.*;

import java.awt.event.*;

public class FrameFix extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Button hitung, tampilkan;
    Checkbox pemlan, ASD, probstat, matkomlan;
    TextArea ya;
    int hasilAkhir;
    double Pemlan, Asd, Matkomlan, Probstat;

    public FrameFix() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 16));
        add(lbJudul);
        lbJudul.setBounds(100, 35, 170, 20);
        //
        cbg = new CheckboxGroup();
        //
        ASD = new Checkbox("ASD", cbg, false);
        this.add(ASD).setBounds(25, 65, 70, 20);
        ASD.addItemListener(new mainAction());
        //
        pemlan = new Checkbox("Pemlan", cbg, false);
        this.add(pemlan).setBounds(105, 65, 80, 20);
        pemlan.addItemListener(new mainAction());
        //
        matkomlan = new Checkbox("Matkomlan", cbg, false);
        this.add(matkomlan).setBounds(188, 65, 90, 20);
        matkomlan.addItemListener(new mainAction());
        //
        probstat = new Checkbox("Probstat", cbg, false);
        this.add(probstat).setBounds(281, 65, 80, 20);
        probstat.addItemListener(new mainAction());
        //
        lbTugas = new Label("Tugas :");
        add(lbTugas);
        lbTugas.setBounds(104, 93, 62, 20);
        //
        lbKuis = new Label("Kuis :");
        add(lbKuis);
        lbKuis.setBounds(104, 123, 70, 20);
        //
        lbUTS = new Label("UTS :");
        add(lbUTS);
        lbUTS.setBounds(104, 153, 70, 20);
        //
        lbUAS = new Label("UAS :");
        add(lbUAS);
        lbUAS.setBounds(104, 183, 70, 20);
        //
        lbHasil = new Label("Hasil :");
        add(lbHasil);
        lbHasil.setBounds(104, 213, 70, 20);
        //
        txtTugas = new TextField("");
        add(txtTugas);
        txtTugas.setBounds(206, 93, 60, 20);
        //
        txtKuis = new TextField("");
        add(txtKuis);
        txtKuis.setBounds(206, 123, 60, 20);
        //
        txtUTS = new TextField("");
        add(txtUTS);
        txtUTS.setBounds(206, 153, 60, 20);
        //
        txtUAS = new TextField("");
        add(txtUAS);
        txtUAS.setBounds(206, 183, 60, 20);
        //
        txtHasil = new TextField("");
        add(txtHasil);
        txtHasil.setBounds(206, 213, 60, 20);
        //
        hitung = new Button("Hitung");
        add(hitung);
        hitung.setBounds(125, 245, 100, 20);
        hitung.addActionListener(new actionPerformed());
        //
        tampilkan = new Button("Tampilkan Nilai Semua Matkul");
        add(tampilkan);
        tampilkan.setBounds(50, 440, 250, 20);
        tampilkan.addActionListener(new textArea());
        //
        ya = new TextArea();
        add(ya);
        ya.setBounds(50, 280, 250, 140);
    }

    class mainAction implements ItemListener {

        public void hapus() {
            txtTugas.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            txtKuis.setText("");
            txtTugas.setText("");
            txtHasil.setText("");
        }

        @Override
        public void itemStateChanged(ItemEvent x) {
            Object source = x.getItemSelectable();
            if (source == ASD) {
                hapus();
                hasilAkhir = 1;
            } else if (source == pemlan) {
                hapus();
                hasilAkhir = 2;
            } else if (source == matkomlan) {
                hapus();
                hasilAkhir = 3;
            } else if (source == probstat) {
                hapus();
                hasilAkhir = 4;
            }
        }
    }

    class ASD {

        int tugas = Integer.parseInt(txtTugas.getText().trim());
        int kuis = Integer.parseInt(txtKuis.getText().trim());
        int uts = Integer.parseInt(txtUTS.getText().trim());
        int uas = Integer.parseInt(txtUAS.getText().trim());
        String hasil = String.valueOf(tugas * 0.3 + kuis * 0.3 + uts * 0.2 + uas * 0.1);

        public void hasil() {
            Asd = Double.valueOf(hasil);
        }
    }

    class pemlan {

        int tugas = Integer.parseInt(txtTugas.getText().trim());
        int kuis = Integer.parseInt(txtKuis.getText().trim());
        int uts = Integer.parseInt(txtUTS.getText().trim());
        int uas = Integer.parseInt(txtUAS.getText().trim());
        String hasil = String.valueOf(tugas * 0.4 + kuis * 0.3 + uts * 0.2 + uas * 0.1);

        public void hasil() {
            Pemlan = Double.valueOf(hasil);
        }
    }

    class probstat {

        int tugas = Integer.parseInt(txtTugas.getText().trim());
        int kuis = Integer.parseInt(txtKuis.getText().trim());
        int uts = Integer.parseInt(txtUTS.getText().trim());
        int uas = Integer.parseInt(txtUAS.getText().trim());
        String hasil = String.valueOf(tugas * 0.30 + kuis * 0.30 + uts * 0.15 + uas * 0.10);

        public void hasil() {
            Probstat = Double.valueOf(hasil);
        }
    }

    class matkomlan {

        int tugas = Integer.parseInt(txtTugas.getText().trim());
        int kuis = Integer.parseInt(txtKuis.getText().trim());
        int uts = Integer.parseInt(txtUTS.getText().trim());
        int uas = Integer.parseInt(txtUAS.getText().trim());
        String hasil = String.valueOf(tugas * 0.25 + kuis * 0.25 + uts * 0.25 + uas * 0.20);

        public void hasil() {
            Matkomlan = Double.valueOf(hasil);
        }
    }

    class actionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (hasilAkhir == 1) {
                ASD ASDAction = new ASD();
                txtHasil.setText(ASDAction.hasil);
                ASDAction.hasil();
            } else if (hasilAkhir == 2) {
                pemlan pemlanAction = new pemlan();
                txtHasil.setText(pemlanAction.hasil);
                pemlanAction.hasil();
            } else if (hasilAkhir == 3) {
                matkomlan matkomlanAction = new matkomlan();
                txtHasil.setText(matkomlanAction.hasil);
                matkomlanAction.hasil();
            } else if (hasilAkhir == 4) {
                probstat probstatAction = new probstat();
                txtHasil.setText(probstatAction.hasil);
                probstatAction.hasil();
            }
        }
    }

    class textArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent x) {
            ya.setText("HASIL NILAI SEMUA MATA KULIAH"
                    + "\n"
                    + "\n Pemlan\t\t:" + Pemlan
                    + "\n ASD\t\t:" + Asd
                    + "\n Matkomlan\t:" + Matkomlan
                    + "\n Probstat\t:" + Probstat);
        }
    }

}

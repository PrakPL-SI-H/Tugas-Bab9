package Bab9;

import java.awt.*;
import java.awt.event.*;

public class HitungNilai extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil, lbTotal;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil, txtTotal;
    Button btnHasil, btnTotal;
    CheckboxGroup cbg;
    Checkbox asd, matkomlan, pemlan, probstat;
    TextArea showResult;
    public static String hasilhitung;
    public static String a = "0";
    public static String b = "0";
    public static String c = "0";
    public static String d = "0";
    public static int tugas, kuis, UTS, UAS;

    public HitungNilai() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(130, 30, 170, 20);
        cbg = new CheckboxGroup();
        asd = new Checkbox("ASD", cbg, false);
        this.add(asd).setBounds(30, 65, 50, 20);
        matkomlan = new Checkbox("Matkomlan", cbg, false);
        this.add(matkomlan).setBounds(105, 65, 80, 20);
        pemlan = new Checkbox("Pemlan", cbg, false);
        this.add(pemlan).setBounds(205, 65, 70, 20);
        probstat = new Checkbox("Probstat", cbg, false);
        this.add(probstat).setBounds(300, 65, 80, 20);
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(110, 90, 62, 20);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(110, 120, 70, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(110, 150, 70, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(110, 180, 70, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(110, 210, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 90, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 120, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 150, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 180, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 210, 60, 20);
        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(135, 250, 100, 20);
        btnHasil.addActionListener(new mainAction());
        showResult = new TextArea();
        add(showResult);
        showResult.setText("HASIL NILAI SEMUA MATA KULIAH : \n" + "\nPemlan\t\t: " + b + "\nASD\t\t: " + a + "\nMatkomlan\t: " + c + "\nProbstat\t\t: " + d);
        showResult.setBounds(50, 285, 300, 150);
        btnTotal = new Button("Tentukan Nilai Semua Matkul");
        add(btnTotal);
        btnTotal.setBounds(50, 450, 300, 30);
        btnTotal.addActionListener(new text());
        asd.addItemListener(new Action());
        matkomlan.addItemListener(new Action());
        pemlan.addItemListener(new Action());
        probstat.addItemListener(new Action());
    }

    class mainAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (asd.getState() == true) {
                ASD asd = new ASD();
                a = String.valueOf(asd.getASD());
                txtHasil.setText(a);
            } else if (pemlan.getState() == true) {
                Pemlan PL = new Pemlan();
                b = String.valueOf(PL.getPemlan());
                txtHasil.setText(b);
            } else if (matkomlan.getState() == true) {
                Matkomlan MKL = new Matkomlan();
                c = String.valueOf(MKL.getMatkomlan());
                txtHasil.setText(c);
            } else if (probstat.getState() == true) {
                Probstat PS = new Probstat();
                d = String.valueOf(PS.getProbstat());
                txtHasil.setText(d);
            }
        }

    }

    class text implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            showResult.setText("HASIL NILAI SEMUA MATA KULIAH : \n" + "\nPemlan\t\t: " + b + "\nASD\t\t: " + a + "\nMatkomlan\t: " + c + "\nProbstat\t\t: " + d);
        }
    }

    class Action implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();
            if (source == asd) {
                tugas = Integer.parseInt(txtTugas.getText().trim());
                kuis = Integer.parseInt(txtKuis.getText().trim());
                UTS = Integer.parseInt(txtUTS.getText().trim());
                UAS = Integer.parseInt(txtUAS.getText().trim());

            } else if (source == matkomlan) {
                tugas = Integer.parseInt(txtTugas.getText().trim());
                kuis = Integer.parseInt(txtKuis.getText().trim());
                UTS = Integer.parseInt(txtUTS.getText().trim());
                UAS = Integer.parseInt(txtUAS.getText().trim());

            } else if (source == pemlan) {
                tugas = Integer.parseInt(txtTugas.getText().trim());
                kuis = Integer.parseInt(txtKuis.getText().trim());
                UTS = Integer.parseInt(txtUTS.getText().trim());
                UAS = Integer.parseInt(txtUAS.getText().trim());

            } else if (source == probstat) {
                tugas = Integer.parseInt(txtTugas.getText().trim());
                kuis = Integer.parseInt(txtKuis.getText().trim());
                UTS = Integer.parseInt(txtUTS.getText().trim());
                UAS = Integer.parseInt(txtUAS.getText().trim());

            }
        }
    }
}

package Praktikum9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MataKuliah extends JFrame {

    Label lbJudul, lbTugas, lbQuiz, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtQuiz, txtUTS, txtUAS, txtHasil;
    TextArea hasilsemua;
    CheckboxGroup cbg;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHasil, btnSemua;
    public String hasilASD = "0.0", hasilPemlan = "0.0", hasilMatkomlan = "0.0", hasilProbstat = "0.0";

    public MataKuliah() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Comic Sans MS", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 10, 170, 20);

        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, false);
        this.add(cbASD).setBounds(10, 40, 70, 20);
        cbPemlan = new Checkbox("Pemlan", cbg, false);
        this.add(cbPemlan).setBounds(95, 40, 70, 20);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        this.add(cbMatkomlan).setBounds(180, 40, 80, 20);
        cbProbstat = new Checkbox("Probstat", cbg, false);
        this.add(cbProbstat).setBounds(265, 40, 70, 20);

        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 70, 62, 20);
        lbQuiz = new Label("Kuis : ");
        add(lbQuiz);
        lbQuiz.setBounds(100, 100, 70, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 130, 70, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 160, 70, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 190, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 70, 60, 20);
        txtQuiz = new TextField("0");
        add(txtQuiz);
        txtQuiz.setBounds(200, 100, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 130, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 160, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 190, 60, 20);

        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(120, 220, 100, 20);

        cbASD.addItemListener(new mainAction());
        cbPemlan.addItemListener(new mainAction());
        cbMatkomlan.addItemListener(new mainAction());
        cbProbstat.addItemListener(new mainAction());

        btnHasil.addActionListener(new Hitung());

        hasilsemua = new TextArea();
        this.add(hasilsemua).setBounds(50, 260, 250, 150);

        btnSemua = new Button("Tampilkan nilai semua matkul");
        add(btnSemua);
        btnSemua.setBounds(50, 430, 250, 20);

        btnSemua.addActionListener(new hasilSemua());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    class mainAction implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double tugas = Integer.parseInt(txtTugas.getText().trim());
            double Quiz = Integer.parseInt(txtQuiz.getText().trim());
            double UTS = Integer.parseInt(txtUTS.getText().trim());
            double UAS = Integer.parseInt(txtUAS.getText().trim());
            double nilai_akhir = ((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
            String hasil = String.valueOf((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
            Object source = e.getItemSelectable();
            if (source == cbASD) {
                txtTugas.setText("0");
                txtQuiz.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
                hasilASD = hasil;
            } else if (source == cbPemlan) {
                txtTugas.setText("0");
                txtQuiz.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
                hasilPemlan = hasil;
            } else if (source == cbMatkomlan) {
                txtTugas.setText("0");
                txtQuiz.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
                hasilMatkomlan = hasil;
            } else if (source == cbProbstat) {
                txtTugas.setText("0");
                txtQuiz.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
                hasilProbstat = hasil;
            }
        }
    }
    
    class Hitung implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            double tugas = Integer.parseInt(txtTugas.getText().trim());
            double Quiz = Integer.parseInt(txtQuiz.getText().trim());
            double UTS = Integer.parseInt(txtUTS.getText().trim());
            double UAS = Integer.parseInt(txtUAS.getText().trim());
            double nilai_akhir = ((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
            String hasil = String.valueOf((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
            txtHasil.setText(hasil);
        }

    }


}

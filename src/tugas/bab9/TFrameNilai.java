package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TFrameNilai extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    JRadioButton cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    TextArea kotak;
    Button btnHitung, btnSemua;
    ButtonGroup cbg;
    String hasilPemlan, hasilASD, hasilMatkom, hasilProb;
    Object cari;
    public TFrameNilai() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(150, 30, 170, 20);
        cbg = new ButtonGroup();
        cbPemlan = new JRadioButton();
        cbPemlan.setText("Pemlan");
        add(cbPemlan);
        cbPemlan.setBounds(25, 75, 90, 20);
        cbASD = new JRadioButton();
        cbASD.setText("ASD");
        add(cbASD);
        cbASD.setBounds(125, 75, 90, 20);
        cbMatkomlan = new JRadioButton();
        cbMatkomlan.setText("Matkomlan");
        add(cbMatkomlan);
        cbMatkomlan.setBounds(225, 75, 90, 20);
        cbProbstat = new JRadioButton();
        cbProbstat.setText("Probstat");
        add(cbProbstat);
        cbProbstat.setBounds(325, 75, 90, 20);
        cbASD.addItemListener(new mainAction1());
        cbPemlan.addItemListener(new mainAction1());
        cbMatkomlan.addItemListener(new mainAction1());
        cbProbstat.addItemListener(new mainAction1());
        cbg.add(cbASD);
        cbg.add(cbMatkomlan);
        cbg.add(cbPemlan);
        cbg.add(cbProbstat);
        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(200, 320, 50, 20);
        btnHitung.addActionListener(new mainAction());
        btnSemua = new Button("Tampilkan Nilai seluruh Mata Kuliah");
        add(btnSemua);
        btnSemua.setBounds(125, 500, 200, 30);
        btnSemua.addMouseListener(new displayAll());
        kotak = new TextArea();
        add(kotak);
        kotak.setBounds(110, 360, 230, 120);
        kotak.addMouseListener(new displayAll());
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(140, 120, 50, 30);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(140, 160, 50, 30);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(140, 200, 50, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(140, 240, 50, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(140, 280, 50, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(280, 120, 40, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(280, 160, 40, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(280, 200, 40, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(280, 240, 40, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(280, 280, 40, 20);
    } class displayAll extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            kotak.setText("Nilai Semua Mata Kuliah " + "\nNilai  Pemlan : " + hasilPemlan + "\nNilai ASD : "
                    + hasilASD + "\nNilai Matkomlan : " + hasilMatkom + "\nNilai Probstat : " + hasilProb);
        } }
    class mainAction extends MouseAdapter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int tugas
                    = Integer.parseInt(txtTugas.getText().trim());
            int kuis
                    = Integer.parseInt(txtKuis.getText().trim());
            int UTS
                    = Integer.parseInt(txtUTS.getText().trim());
            int UAS
                    = Integer.parseInt(txtUAS.getText().trim());
            if (cbPemlan.isSelected()) {
                hasilPemlan = String.valueOf(tugas / 4 + kuis / 4 + UTS / 4 + UAS / 4);
                txtHasil.setText(hasilPemlan);
            }
            if (cbASD.isSelected()) {
                hasilASD = String.valueOf(tugas / 6 + kuis / 2 + UTS / 4 + UAS / 4);
                txtHasil.setText(hasilASD);
            }
            if (cbMatkomlan.isSelected()) {
                hasilMatkom = String.valueOf(tugas / 2 + kuis / 6 + UTS / 4 + UAS / 4);
                txtHasil.setText(hasilMatkom);
            }
            if (cbProbstat.isSelected()) {
                hasilProb = String.valueOf(tugas / 4 + kuis / 4 + UTS / 4 + UAS / 4);
                txtHasil.setText(hasilProb);
            }}}
    class mainAction1 implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            cari = e.getItemSelectable();
            if (cari == cbASD) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (cari == cbPemlan) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (cari == cbMatkomlan) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (cari == cbProbstat) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            }}}}
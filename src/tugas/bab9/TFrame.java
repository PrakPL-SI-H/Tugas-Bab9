package tugas.bab9;
import java.awt.*;
import java.awt.event.*;

public class TFrame extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS,lbNilaiAk;
    TextField txtTugas, txtKuis, txtUTS, txtUAS,txtNilaiAk;
    Button btnHasil, btnLihat;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    CheckboxGroup cbg1;
    TextArea txtarea1;
    String Study, ASD = "", PEMLAN = "", MATKOMLAN = "", PROBSTAT = "";

    public TFrame() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 20));
        add(lbJudul);
        lbJudul.setForeground(Color.DARK_GRAY);
        lbJudul.setBounds(135, 35, 350, 20);
        lbTugas = new Label("Tugas");
        add(lbTugas);
        lbTugas.setForeground(Color.white);
        lbTugas.setBounds(100, 90, 120, 20);
        lbKuis = new Label("Kuis");
        add(lbKuis);
        lbKuis.setForeground(Color.white);
        lbKuis.setBounds(100, 120, 120, 20);
        lbUTS = new Label("UTS");
        add(lbUTS);
        lbUTS.setForeground(Color.white);
        lbUTS.setBounds(100, 150, 120, 20);
        lbUAS = new Label("UAS");
        add(lbUAS);
        lbUAS.setForeground(Color.white);
        lbUAS.setBounds(100, 180, 120, 20);
        lbNilaiAk = new Label("Nilai Akhir");
        add(lbNilaiAk);
        lbNilaiAk.setForeground(Color.white);
        lbNilaiAk.setBounds(100, 210, 120, 20);

        txtTugas = new TextField("");
        add(txtTugas);
        txtTugas.setBounds(240, 90, 120, 20);
        txtKuis = new TextField("");
        add(txtKuis);
        txtKuis.setBounds(240, 120, 120, 20);
        txtUTS = new TextField("");
        add(txtUTS);
        txtUTS.setBounds(240, 150, 120, 20);
        txtUAS = new TextField("");
        add(txtUAS);
        txtUAS.setBounds(240, 180, 120, 20);
        txtNilaiAk = new TextField("");
        add(txtNilaiAk);
        txtNilaiAk.setBounds(240, 210, 120, 20);

        cbg1 = new CheckboxGroup();
        cbASD = new Checkbox(("ASD"), cbg1, false);
        add(cbASD);
        cbASD.setForeground(Color.WHITE);
        cbASD.setBounds(40, 60, 80, 20);
        cbPemlan = new Checkbox("Pemlan", cbg1, false);
        add(cbPemlan);
        cbPemlan.setForeground(Color.WHITE);
        cbPemlan.setBounds(120, 60, 80, 20);
        cbMatkomlan = new Checkbox(("Matkomlan"), cbg1, 
        false);
        add(cbMatkomlan);
        cbMatkomlan.setForeground(Color.WHITE);
        cbMatkomlan.setBounds(220, 60, 80, 20);
        cbProbstat = new Checkbox("Probstat", cbg1, false);
        add(cbProbstat);
        cbProbstat.setForeground(Color.WHITE);
        cbProbstat.setBounds(320, 60, 80, 20);
        cbASD.addItemListener(new mainmAT());
        cbPemlan.addItemListener(new mainmAT());
        cbMatkomlan.addItemListener(new mainmAT());
        cbProbstat.addItemListener(new mainmAT());

        btnHasil = new Button("Hasil");
        add(btnHasil);
        btnHasil.setBounds(240, 240, 120, 20);
        btnHasil.addActionListener(new mainAction());

        txtarea1 = new TextArea();
        txtarea1.setFont(new Font("Arial", 1, 14));
        add(txtarea1);
        txtarea1.setBounds(60, 275, 340, 175);

        btnLihat = new Button("Tampilkan semua nilai matkul");
        add(btnLihat);
        btnLihat.setBounds(60, 475, 340, 30);
        btnLihat.addActionListener(new mainAction2());
    }
    class mainAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double Tugas = Double.parseDouble(txtTugas.getText().trim());
            double Kuis =  Double.parseDouble(txtKuis.getText().trim());
            double UTS = Double.parseDouble(txtUTS.getText().trim());
            double UAS = Double.parseDouble(txtUAS.getText().trim());
            String NilaiAk = String.valueOf((Tugas + Kuis + UTS + UAS) / 4);
            txtNilaiAk.setText(NilaiAk);

            if (Study == "ASD") {
                ASD = txtNilaiAk.getText().toString();
            } else if (Study == "Pemrograman Lanjut") {
                PEMLAN = txtNilaiAk.getText().toString();
            } else if (Study == "Matematika Komputasi Lanjutan") {
                MATKOMLAN = txtNilaiAk.getText().toString();
            } else if (Study == "Probabilitas dan Statistika") {
                PROBSTAT = txtNilaiAk.getText().toString();
            }
        }
    }
    class mainmAT implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            txtTugas.toString();
            txtTugas.setText("");
            txtKuis.toString();
            txtKuis.setText("");
            txtUTS.toString();
            txtUTS.setText("");
            txtUAS.toString();
            txtUAS.setText("");
            txtNilaiAk.toString();
            txtNilaiAk.setText("");
            Object cek = e.getItemSelectable();

            if (cek == cbASD) {
                Study = "ASD";
            } else if (cek == cbPemlan) {
                Study = "Pemrograman Lanjut";
            } else if (cek == cbMatkomlan) {
                Study = "Matematika Komputasi Lanjutan";
            } else {
                Study = "Probabilitas dan Statistika";
            }
        }
    }
    class mainAction2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String tamp = "\n\tHasil Nilai Semua Matkul" 
                    +"\n\nASD\t\t\t\t\t: " + ASD
                    + "\nPemrograman Lanjut\t\t: " + PEMLAN
                    + "\nMatematika Komputasi Lanjutan\t: " + MATKOMLAN
                    + "\nProbabilitas dan Statistika\t\t: " + PROBSTAT;
            txtarea1.toString();
            txtarea1.setText(tamp);
        }
    }
}

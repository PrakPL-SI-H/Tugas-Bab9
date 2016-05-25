package maingui;

import java.awt.*;
import java.awt.event.*;

public class FrameGUI extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cb;
    Checkbox cbPemlan, cbASD, cbMatkomlan, cbProbstat;
    Button btHasil, btShow;
    TextArea desc;

    ASD asd = new ASD();
    Matkomlan mkl = new Matkomlan();
    Pemlan pl = new Pemlan();
    Probstat ps = new Probstat();

    public FrameGUI() {
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 40, 170, 20);
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 100, 62, 20);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 130, 70, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 160, 70, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 190, 70, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 220, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 100, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 130, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 160, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 190, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 220, 60, 20);

        cb = new CheckboxGroup();
        cbPemlan = new Checkbox("Pemlan", cb, false);
        this.add(cbPemlan).setBounds(100, 70, 80, 20);
        cbASD = new Checkbox("ASD", cb, false);
        this.add(cbASD).setBounds(20, 70, 100, 20);
        cbMatkomlan = new Checkbox("Matkomlan", cb, false);
        this.add(cbMatkomlan).setBounds(180, 70, 80, 20);
        cbProbstat = new Checkbox("Probstat", cb, false);
        this.add(cbProbstat).setBounds(270, 70, 90, 20);

        cbASD.addItemListener(new mainAction2());
        cbPemlan.addItemListener(new mainAction2());
        cbMatkomlan.addItemListener(new mainAction2());
        cbProbstat.addItemListener(new mainAction2());

        btHasil = new Button("Hitung");
        add(btHasil);
        btHasil.setBounds(120, 260, 100, 20);
        btHasil.addActionListener(new mainAction());

        desc = new TextArea();
        add(desc);
        desc.setBounds(40, 290, 270, 170);

        btShow = new Button("Tampilkan nilai semua matkul");
        add(btShow);
        btShow.setBounds(40, 470, 270, 20);
        btShow.addActionListener(new mainActionShow());
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int tugas = Integer.parseInt(txtTugas.getText().trim());
            int kuis = Integer.parseInt(txtKuis.getText().trim());
            int uts = Integer.parseInt(txtUTS.getText().trim());
            int uas = Integer.parseInt(txtUAS.getText().trim());

            if (cbASD.getState() == true) {
                asd = new ASD(tugas, kuis, uts, uas);
                String hasil = String.valueOf(asd.nilaiAkhir());
                txtHasil.setText(hasil);
            } else if (cbPemlan.getState() == true) {
                pl = new Pemlan(tugas, kuis, uts, uas);
                String hasil = String.valueOf(pl.nilaiAkhir());
                txtHasil.setText(hasil);
            } else if (cbMatkomlan.getState() == true) {
                mkl = new Matkomlan(tugas, kuis, uts, uas);
                String hasil = String.valueOf(mkl.nilaiAkhir());
                txtHasil.setText(hasil);
            } else if (cbProbstat.getState() == true) {
                ps = new Probstat(tugas, kuis, uts, uas);
                String hasil = String.valueOf(ps.nilaiAkhir());
                txtHasil.setText(hasil);
            }
        }
    }

    class mainAction2 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();
            if (source == cbASD) {
                txtTugas.setText("" + asd.getTugas());
                txtKuis.setText("" + asd.getKuis());
                txtUTS.setText("" + asd.getUTS());
                txtUAS.setText("" + asd.getUAS());
                txtHasil.setText("" + asd.getHasil());
            } else if (source == cbPemlan) {
                txtTugas.setText("" + pl.getTugas());
                txtKuis.setText("" + pl.getKuis());
                txtUTS.setText("" + pl.getUTS());
                txtUAS.setText("" + pl.getUAS());
                txtHasil.setText("" + pl.getHasil());
            } else if (source == cbMatkomlan) {
                txtTugas.setText("" + mkl.getTugas());
                txtKuis.setText("" + mkl.getKuis());
                txtUTS.setText("" + mkl.getUTS());
                txtUAS.setText("" + mkl.getUAS());
                txtHasil.setText("" + mkl.getHasil());
            } else if (source == cbProbstat) {
                txtTugas.setText("" + ps.getTugas());
                txtKuis.setText("" + ps.getKuis());
                txtUTS.setText("" + ps.getUTS());
                txtUAS.setText("" + ps.getUAS());
                txtHasil.setText("" + ps.getHasil());
            }
        }
    }

    class mainActionShow implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            desc.setText("HASIL SEMUA NILAI MATA KULIAH\n\n"
                    + "\nPemlan                  : " + pl.getHasil()
                    + "\nASD                        : " + asd.getHasil()
                    + "\nMatkomlan            : " + mkl.getHasil()
                    + "\nProbstat           `    : " + ps.getHasil());
        }
    }
}

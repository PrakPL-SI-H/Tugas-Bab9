package tugas.bab9;

import java.awt.*;
import java.awt.event.*;

public class Matkul extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;//menggabungkan jadi 1 grup
    Checkbox pl, asd, mat, prob;
    Button btnHitung, btnTampil;
    TextArea text;
    String as, p, m, pro;

    public Matkul() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(125, 30, 170, 20);

        cbg = new CheckboxGroup();
        asd = new Checkbox("ASD", cbg, false);
        this.add(asd).setBounds(30, 60, 70, 20);
        pl = new Checkbox("Pemlan", cbg, false);
        this.add(pl).setBounds(110, 60, 90, 20);
        mat = new Checkbox("Matkomlan", cbg, false);
        this.add(mat).setBounds(200, 60, 100, 20);
        prob = new Checkbox("Probstat", cbg, false);
        this.add(prob).setBounds(300, 60, 120, 20);
        asd.addItemListener(new mainAction());
        pl.addItemListener(new mainAction());
        mat.addItemListener(new mainAction());
        prob.addItemListener(new mainAction());

        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(120, 90, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(210, 90, 70, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(120, 120, 70, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(210, 120, 70, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(120, 150, 70, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(210, 150, 70, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(120, 180, 70, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(210, 180, 70, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(120, 210, 70, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(210, 210, 70, 20);
        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(150, 240, 70, 20);
        btnHitung.addActionListener(new listener());

        text = new TextArea("\tHasil Nilai Semua Mata Kuliah");
        text.setBounds(50, 270, 300, 200);
        add(text);
        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(100, 500, 200, 30);
        btnTampil.addActionListener(new listener());
    }

    class mainAction implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (asd.getState()) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (pl.getState()) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (mat.getState()) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            } else if (prob.getState()) {
                txtTugas.setText("0");
                txtKuis.setText("0");
                txtUTS.setText("0");
                txtUAS.setText("0");
                txtHasil.setText("0");
            }
        }
    }

    class listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getActionCommand().equalsIgnoreCase("hitung")) {
                if (asd.getState()) {
                    ASD a = new ASD(txtTugas.getText(), txtKuis.getText(), txtUTS.getText(), txtUAS.getText());
                    String h = a.getHasil();
                    txtHasil.setText(h);
                    as = h;
                } else if (pl.getState()) {
                    Pemlan p2 = new Pemlan(txtTugas.getText(), txtKuis.getText(), txtUTS.getText(), txtUAS.getText());
                    String h = p2.getHasil();
                    txtHasil.setText(h);
                    p = h;
                } else if (mat.getState()) {
                    Matkom m2 = new Matkom(txtTugas.getText(), txtKuis.getText(), txtUTS.getText(), txtUAS.getText());
                    String h = m2.getHasil();
                    txtHasil.setText(h);
                    m = h;

                } else if (prob.getState()) {
                    Probstat pr = new Probstat(txtTugas.getText(), txtKuis.getText(), txtUTS.getText(), txtUAS.getText());
                    String h = pr.getHasil();
                    txtHasil.setText(h);
                    pro = h;
                }
            }
            if (ae.getActionCommand().equalsIgnoreCase("Tampilkan nilai semua matkul")) {
                text.setText("Hasil Nilai Semua Mata Kuliah"
                        + "\nASD\t\t  :   " + as
                        + "\nPemlan\t\t  :   " + p
                        + "\nMatkomlan\t  :   " + m
                        + "\nProbstat\t\t  :   " + pro
                );
            }
        }
    }
}

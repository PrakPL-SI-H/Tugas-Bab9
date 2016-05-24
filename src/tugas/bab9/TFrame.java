package tugas.bab9;

import java.awt.*;
import java.awt.event.*;

public class TFrame extends Frame {

    Label lbjudul, lbtugas, lbuas, lbuts, lbkuis, lbhasil;
    TextField tftugas, tfkuis, tfuts, tfuas, tfhasil;
    TextArea tatampilsemua;
    Button btnhasil, btntampilkansemua;
    CheckboxGroup cbg;
    Checkbox cbasd, cbpemlan, cbprobstat, cbmatkomlan;
    public boolean asd, pemlan, matkomlan, probstat;
    public double nilaiasd, nilaipemlan, nilaimatkomlan, nilaiprobstat;

    public TFrame() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        lbjudul = new Label("~~ Hitung Nilai Akhir ~~");
        lbjudul.setFont(new Font("Arial", 1, 14));
        add(lbjudul);
        lbjudul.setBounds(130, 40, 200, 20);

        lbtugas = new Label("Tugas");
        lbtugas.setBounds(125, 100, 70, 20);
        add(lbtugas);

        lbkuis = new Label("Kuis");
        lbkuis.setBounds(125, 130, 70, 20);
        add(lbkuis);

        lbuts = new Label("UTS");
        lbuts.setBounds(125, 160, 70, 20);
        add(lbuts);

        lbuas = new Label("UAS");
        lbuas.setBounds(125, 190, 70, 20);
        add(lbuas);

        lbhasil = new Label("Hasil");
        lbhasil.setBounds(125, 220, 70, 20);
        add(lbhasil);

        tftugas = new TextField("0");
        add(tftugas);
        tftugas.setBounds(270, 100, 60, 20);

        tfkuis = new TextField("0");
        add(tfkuis);
        tfkuis.setBounds(270, 130, 60, 20);

        tfuts = new TextField("0");
        add(tfuts);
        tfuts.setBounds(270, 160, 60, 20);

        tfuas = new TextField("0");
        add(tfuas);
        tfuas.setBounds(270, 190, 60, 20);

        tfhasil = new TextField("0");
        add(tfhasil);
        tfhasil.setBounds(270, 220, 60, 20);

        btnhasil = new Button("Hitung");
        add(btnhasil);
        btnhasil.setBounds(250, 250, 100, 20);

        tatampilsemua = new TextArea("");
        add(tatampilsemua);
        tatampilsemua.setBounds(110, 300, 235, 200);

        btntampilkansemua = new Button("Tampilkan Nilai Semua Matkul");
        add(btntampilkansemua);
        btntampilkansemua.setBounds(110, 520, 235, 25);

        cbg = new CheckboxGroup();
        cbasd = new Checkbox("ASD", cbg, false);
        this.add(cbasd).setBounds(35, 70, 90, 20);
        cbpemlan = new Checkbox("Pemlan", cbg, false);
        this.add(cbpemlan).setBounds(125, 70, 90, 20);
        cbmatkomlan = new Checkbox("Matkomlan", cbg, false);
        this.add(cbmatkomlan).setBounds(220, 70, 90, 20);
        cbprobstat = new Checkbox("Probstat", cbg, false);
        this.add(cbprobstat).setBounds(330, 70, 90, 20);

        cbasd.addItemListener(new mainActionChekBox());
        cbpemlan.addItemListener(new mainActionChekBox());
        cbmatkomlan.addItemListener(new mainActionChekBox());
        cbprobstat.addItemListener(new mainActionChekBox());
        btnhasil.addActionListener(new mainAction());
        btntampilkansemua.addActionListener(new mainActionTampilsemua());
    }

    class mainAction extends mainActionChekBox implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            double tugas = Double.parseDouble(tftugas.getText().trim());
            double kuis = Double.parseDouble(tfkuis.getText().trim());
            double uts = Double.parseDouble(tfuts.getText().trim());
            double uas = Double.parseDouble(tfuas.getText().trim());
            String hasil = "0";
            if (asd == true) {
                hasil = String.valueOf((tugas + kuis + uts + uas) / 4);
                nilaiasd = Double.parseDouble(hasil);
            } else if (pemlan == true) {
                hasil = String.valueOf((tugas + kuis + uts + uas) / 4);
                nilaipemlan = Double.parseDouble(hasil);
            } else if (matkomlan == true) {
                hasil = String.valueOf((tugas + kuis + uts + uas) / 4);
                nilaimatkomlan = Double.parseDouble(hasil);
            } else if (probstat == true) {
                hasil = String.valueOf((tugas + kuis + uts + uas) / 4);
                nilaiprobstat = Double.parseDouble(hasil);
            }
            tfhasil.setText(hasil);
        }
    }

    class mainActionTampilsemua extends mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String temp = ("\n\tHasil Nilai Semua Matkul"
                    + "\n\n\tASD\t\t= " + nilaiasd
                    + "\n\n\tPemlan\t\t= " + nilaipemlan
                    + "\n\n\tMatkomlan\t= " + nilaimatkomlan
                    + "\n\n\tProbstat\t\t= " + nilaiprobstat);
            tatampilsemua.setText(temp);
        }
    }

    class mainActionChekBox implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();
            asd = false;
            pemlan = false;
            matkomlan = false;
            probstat = false;
            if (source == cbasd) {
                asd = true;
            } else if (source == cbpemlan) {
                pemlan = true;
            } else if (source == cbmatkomlan) {
                matkomlan = true;
            } else {
                probstat = true;
            }
        }
    }
}

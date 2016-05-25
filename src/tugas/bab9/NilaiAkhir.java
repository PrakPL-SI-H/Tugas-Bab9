package javaapplication59;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NilaiAkhir extends JFrame implements ActionListener {

    public JLabel judul, tugas, kuis, uts, uas, hasil;
    public JTextField nilaitugas, nilaikuis, nilaiuts, nilaiuas, nilaihasil;
    public ButtonGroup bg;
    public static int ntugas, nkuis, nuts, nuas;
    public JButton hitung, tampilannilai;
    public JTextArea tampilan;
    public String nilaiasd, nilaipemlan, nilaimatkomlan, nilaiprobstat, nhasil;
    public JRadioButton asd, pemlan, matkomlan, probstat;

    public void setjudul() {
        judul = new JLabel("Hitung Nilai Akhir");
        add(judul);
        judul.setBounds(190, 20, 200, 20);
    }

    public void setasd() {
        asd = new JRadioButton("ASD");
        add(asd);
        asd.setBounds(40, 40, 100, 40);
        asd.addActionListener(this);
    }

    public void setpemlan() {
        pemlan = new JRadioButton("PEMLAN");
        add(pemlan);
        pemlan.setBounds(150, 40, 100, 40);
        pemlan.addActionListener(this);
    }

    public void setmatkomlan() {
        matkomlan = new JRadioButton("MATKOMLAN");
        add(matkomlan);
        matkomlan.setBounds(260, 40, 100, 40);
        matkomlan.addActionListener(this);
    }

    public void setprobstat() {
        probstat = new JRadioButton("PROBSTAT");
        add(probstat);
        probstat.setBounds(370, 40, 100, 40);
        probstat.addActionListener(this);
    }

    public void setradiobutton() {
        setasd();
        setpemlan();
        setmatkomlan();
        setprobstat();
        bg = new ButtonGroup();
        bg.add(asd);
        bg.add(pemlan);
        bg.add(matkomlan);
        bg.add(probstat);
    }

    public void settugas() {
        tugas = new JLabel("Tugas : ");
        add(tugas);
        tugas.setBounds(160, 90, 50, 20);
        nilaitugas = new JTextField("0");
        add(nilaitugas);
        nilaitugas.setBounds(220, 90, 50, 20);
    }

    public void setkuis() {
        kuis = new JLabel("Kuis : ");
        add(kuis);
        kuis.setBounds(160, 120, 50, 20);
        nilaikuis = new JTextField("0");
        add(nilaikuis);
        nilaikuis.setBounds(220, 120, 50, 20);
    }

    public void setuts() {
        uts = new JLabel("UTS : ");
        add(uts);
        uts.setBounds(160, 150, 50, 20);
        nilaiuts = new JTextField("0");
        add(nilaiuts);
        nilaiuts.setBounds(220, 150, 50, 20);
    }

    public void setuas() {
        uas = new JLabel("UAS : ");
        add(uas);
        uas.setBounds(160, 180, 50, 20);
        nilaiuas = new JTextField("0");
        add(nilaiuas);
        nilaiuas.setBounds(220, 180, 50, 20);
    }

    public void sethasil() {
        hasil = new JLabel("Hasil : ");
        add(hasil);
        hasil.setBounds(160, 210, 50, 20);
        nilaihasil = new JTextField("0");
        add(nilaihasil);
        nilaihasil.setBounds(220, 210, 50, 20);
        nilaihasil.enable(false);
    }

    public void setlabelnilai() {
        settugas();
        setkuis();
        setuts();
        setuas();
        sethasil();
    }

    public void sethitung() {
        hitung = new JButton("Hitung");
        add(hitung);
        hitung.setBounds(190, 240, 100, 20);
        hitung.addActionListener(this);
    }

    public void settampilan() {
        tampilan = new JTextArea();
        add(tampilan);
        tampilan.setBounds(90, 270, 300, 200);
        tampilan.setBackground(Color.WHITE);
        tampilan.setText("\tHASIL SEMUA MATA KULIAH\n\n" + "ASD\t: " + nilaiasd + "\nPEMLAN\t: " + nilaipemlan + "\nMATKOMLAN\t: " + nilaimatkomlan + "\nPROBSTAT\t: " + nilaiprobstat);
    }

    public void settampilannilai() {
        tampilannilai = new JButton("Tampilkan Semua Nilai Matkul");
        add(tampilannilai);
        tampilannilai.setBounds(90, 480, 300, 20);
        tampilannilai.addActionListener(this);
    }

    public void defaultradiobutton() {
        asd.addActionListener(new button());
        pemlan.addActionListener(new button());
        matkomlan.addActionListener(new button());
        probstat.addActionListener(new button());
    }

    NilaiAkhir() {
        setLayout(null);
        setjudul();
        setradiobutton();
        setlabelnilai();
        settampilannilai();
        sethitung();
        defaultradiobutton();
    }

    class button implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            nilaitugas.setText("0");
            nilaikuis.setText("0");
            nilaiuts.setText("0");
            nilaiuas.setText("0");
            nilaihasil.setText("0");
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        ntugas = Integer.parseInt(nilaitugas.getText());
        nkuis = Integer.parseInt(nilaikuis.getText());
        nuts = Integer.parseInt(nilaiuts.getText());
        nuas = Integer.parseInt(nilaiuas.getText());
        nhasil = String.valueOf((ntugas + nkuis + nuts + nuas) / 4);
        if (asd.isSelected()) {
            nilaiasd = String.valueOf((ntugas + nkuis + nuts + nuas) / 4);
        }
        if (pemlan.isSelected()) {
            nilaipemlan = String.valueOf((ntugas + nkuis + nuts + nuas) / 4);
        }
        if (matkomlan.isSelected()) {
            nilaimatkomlan = String.valueOf((ntugas + nkuis + nuts + nuas) / 4);
        }
        if (probstat.isSelected()) {
            nilaiprobstat = String.valueOf((ntugas + nkuis + nuts + nuas) / 4);
        }
        if (source == hitung) {
            nilaihasil.setText(nhasil);
        }
        if (source == tampilannilai) {
            settampilan();
        }
    }
}

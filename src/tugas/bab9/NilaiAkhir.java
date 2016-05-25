package javaapplication59;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NilaiAkhir extends JFrame implements ActionListener {

    public JLabel judul, tugas, kuis, uts, uas, hasil;
    public JTextField nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiHasil;
    public ButtonGroup bg;
    public static int nTugas, nKuis, nUts, nUas;
    public JButton hitung, tampilanNilai;
    public JTextArea tampilan;
    public String nilaiAsd, nilaiPemlan, nilaiMatkomlan, nilaiProbstat, nHasil;
    public JRadioButton Asd, Pemlan, Matkomlan, Probstat;

    public void setJudul() {
        judul = new JLabel("Hitung Nilai Akhir");
        add(judul);
        judul.setBounds(190, 20, 200, 20);
    }

    public void setAsd() {
        Asd = new JRadioButton("ASD");
        add(Asd);
        Asd.setBounds(40, 40, 100, 40);
        Asd.addActionListener(this);
    }

    public void setPemlan() {
        Pemlan = new JRadioButton("PEMLAN");
        add(Pemlan);
        Pemlan.setBounds(150, 40, 100, 40);
        Pemlan.addActionListener(this);
    }

    public void setMatkomlan() {
        Matkomlan = new JRadioButton("MATKOMLAN");
        add(Matkomlan);
        Matkomlan.setBounds(260, 40, 100, 40);
        Matkomlan.addActionListener(this);
    }

    public void setProbstat() {
        Probstat = new JRadioButton("PROBSTAT");
        add(Probstat);
        Probstat.setBounds(370, 40, 100, 40);
        Probstat.addActionListener(this);
    }

    public void setradiobutton() {
        setAsd();
        setPemlan();
        setMatkomlan();
        setProbstat();
        bg = new ButtonGroup();
        bg.add(Asd);
        bg.add(Pemlan);
        bg.add(Matkomlan);
        bg.add(Probstat);
    }

    public void setTugas() {
        tugas = new JLabel("Tugas : ");
        add(tugas);
        tugas.setBounds(160, 90, 50, 20);
        nilaiTugas = new JTextField("0");
        add(nilaiTugas);
        nilaiTugas.setBounds(220, 90, 50, 20);
    }

    public void setKuis() {
        kuis = new JLabel("Kuis : ");
        add(kuis);
        kuis.setBounds(160, 120, 50, 20);
        nilaiKuis = new JTextField("0");
        add(nilaiKuis);
        nilaiKuis.setBounds(220, 120, 50, 20);
    }

    public void setUts() {
        uts = new JLabel("UTS : ");
        add(uts);
        uts.setBounds(160, 150, 50, 20);
        nilaiUts = new JTextField("0");
        add(nilaiUts);
        nilaiUts.setBounds(220, 150, 50, 20);
    }

    public void setUas() {
        uas = new JLabel("UAS : ");
        add(uas);
        uas.setBounds(160, 180, 50, 20);
        nilaiUas = new JTextField("0");
        add(nilaiUas);
        nilaiUas.setBounds(220, 180, 50, 20);
    }

    public void setHasil() {
        hasil = new JLabel("Hasil : ");
        add(hasil);
        hasil.setBounds(160, 210, 50, 20);
        nilaiHasil = new JTextField("0");
        add(nilaiHasil);
        nilaiHasil.setBounds(220, 210, 50, 20);
        nilaiHasil.enable(false);
    }

    public void setLabelNilai() {
        setTugas();
        setKuis();
        setUts();
        setUas();
        setHasil();
    }

    public void setHitung() {
        hitung = new JButton("Hitung");
        add(hitung);
        hitung.setBounds(190, 240, 100, 20);
        hitung.addActionListener(this);
    }

    public void setTampilan() {
        tampilan = new JTextArea();
        add(tampilan);
        tampilan.setBounds(90, 270, 300, 200);
        tampilan.setBackground(Color.WHITE);
        tampilan.setText("\tHASIL SEMUA MATA KULIAH\n\n" + "ASD\t: " + nilaiAsd + "\nPEMLAN\t: " + nilaiPemlan + "\nMATKOMLAN\t: " + nilaiMatkomlan + "\nPROBSTAT\t: " + nilaiProbstat);
    }

    public void setTampilanNilai() {
        tampilanNilai = new JButton("Tampilkan Semua Nilai Matkul");
        add(tampilanNilai);
        tampilanNilai.setBounds(90, 480, 300, 20);
        tampilanNilai.addActionListener(this);
    }

    public void defaultradiobutton() {
        Asd.addActionListener(new button());
        Pemlan.addActionListener(new button());
        Matkomlan.addActionListener(new button());
        Probstat.addActionListener(new button());
    }

    NilaiAkhir() {
        setLayout(null);
        setJudul();
        setradiobutton();
        setLabelNilai();
        setTampilanNilai();
        setHitung();
        defaultradiobutton();
    }

    class button implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            nilaiTugas.setText("0");
            nilaiKuis.setText("0");
            nilaiUts.setText("0");
            nilaiUas.setText("0");
            nilaiHasil.setText("0");
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        nTugas = Integer.parseInt(nilaiTugas.getText());
        nKuis = Integer.parseInt(nilaiKuis.getText());
        nUts = Integer.parseInt(nilaiUts.getText());
        nUas = Integer.parseInt(nilaiUas.getText());
        nHasil = String.valueOf((nTugas + nKuis + nUts + nUas) / 4);
        if (Asd.isSelected()) {
            nilaiAsd = String.valueOf((nTugas + nKuis + nUts + nUas) / 4);
        }
        if (Pemlan.isSelected()) {
            nilaiPemlan = String.valueOf((nTugas + nKuis + nUts + nUas) / 4);
        }
        if (Matkomlan.isSelected()) {
            nilaiMatkomlan = String.valueOf((nTugas + nKuis + nUts + nUas) / 4);
        }
        if (Probstat.isSelected()) {
            nilaiProbstat = String.valueOf((nTugas + nKuis + nUts + nUas) / 4);
        }
        if (source == hitung) {
            nilaiHasil.setText(nHasil);
        }
        if (source == tampilanNilai) {
            setTampilan();
        }
    }
}

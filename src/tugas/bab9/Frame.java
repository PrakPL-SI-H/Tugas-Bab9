package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame extends JFrame {
    JLabel lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil, asd, matkomlan, pemlan, probstat;
    JTextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    JButton hasil, tampil;
    JRadioButton Basd, Bmatkomlan, Bpemlan, Bprobstat;
    ButtonGroup bg;
    JTextArea output;
    String hasilasd, hasilpl, hasilmkl, hasilps;
    public Frame() {
        setLayout(null);
        lbJudul = new JLabel("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Caligraphy", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(150, 0, 200, 30);
        Basd = new JRadioButton();
        add(Basd);
        Basd.setBounds(10, 40, 20, 20);
        Bmatkomlan = new JRadioButton();
        add(Bmatkomlan);
        Bmatkomlan.setBounds(110, 40, 20, 20);
        Bpemlan = new JRadioButton();
        add(Bpemlan);
        Bpemlan.setBounds(210, 40, 20, 20);
        Bprobstat = new JRadioButton();
        add(Bprobstat);
        Bprobstat.setBounds(310, 40, 20, 20);
        asd = new JLabel("ASD");
        add(asd);
        asd.setBounds(30, 35, 40, 30);
        matkomlan = new JLabel("MatKomLan");
        add(matkomlan);
        matkomlan.setBounds(130, 35, 70, 30);
        pemlan = new JLabel("PemLan");
        add(pemlan);
        pemlan.setBounds(230, 35, 60, 30);
        probstat = new JLabel("ProbStat");
        add(probstat);
        probstat.setBounds(330, 35, 60, 30);
        bg = new ButtonGroup();
        bg.add(Basd);
        bg.add(Bmatkomlan);
        bg.add(Bpemlan);
        bg.add(Bprobstat);
        lbTugas = new JLabel("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 100, 85, 25);
        lbKuis = new JLabel("Kuis   : ");
        add(lbKuis);
        lbKuis.setBounds(100, 130, 85, 25);
        lbUTS = new JLabel("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 160, 85, 25);
        lbUAS = new JLabel("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 190, 85, 25);
        lbHasil = new JLabel("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 220, 85, 25);
        txtTugas = new JTextField("");
        add(txtTugas);
        txtTugas.setBounds(200, 100, 65, 25);
        txtKuis = new JTextField("");
        add(txtKuis);
        txtKuis.setBounds(200, 130, 65, 25);
        txtUTS = new JTextField("");
        add(txtUTS);
        txtUTS.setBounds(200, 160, 65, 25);
        txtUAS = new JTextField("");
        add(txtUAS);
        txtUAS.setBounds(200, 190, 65, 25);
        txtHasil = new JTextField("");
        add(txtHasil);
        txtHasil.setBounds(200, 220, 65, 25);
        hasil = new JButton("Hitung");
        add(hasil);
        hasil.setBounds(150, 250, 90, 30);
        hasil.addMouseListener(new moslistener());
        output = new JTextArea();
        add(output);
        output.setBounds(150, 300, 200, 100);
        tampil = new JButton("Tampilkan Semua Nilai Mata Kuliah");
        add(tampil);
        tampil.setBounds(150, 430, 200, 30);
        tampil.addMouseListener(new tampil());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        show();
    }
    public class moslistener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            int tugass = Integer.parseInt(txtTugas.getText().trim());
            int kuiss = Integer.parseInt(txtKuis.getText().trim());
            int UTS = Integer.parseInt(txtUTS.getText().trim());
            int UAS = Integer.parseInt(txtUAS.getText().trim());
            if (Basd.isSelected()) {
                hasilasd = String.valueOf(tugass / 2 + kuiss / 3 + UTS / 4 + UAS / 5);
                txtHasil.setText(hasilasd);
            }
            if (Bpemlan.isSelected()) {
                hasilpl = String.valueOf(tugass / 3 + kuiss / 4 + UTS / 5 + UAS / 2);
                txtHasil.setText(hasilpl);
            }
            if (Bmatkomlan.isSelected()) {
                hasilmkl = String.valueOf(tugass / 4 + kuiss / 5 + UTS / 2 + UAS / 3);
                txtHasil.setText(hasilmkl);
            }
            if (Bprobstat.isSelected()) {
                hasilps = String.valueOf(tugass / 5 + kuiss / 2 + UTS / 3 + UAS / 4);
                txtHasil.setText(hasilps);
            }
        }
    }
    public class tampil extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            output.setText("Nilai ASD\t\t:" + hasilasd + "\nNilai PemLan\t\t:" + hasilpl + "\nNilai MatKomLan\t: " + hasilmkl + "\nNilai ProbStat\t\t: " + hasilps);
        }
    }
}

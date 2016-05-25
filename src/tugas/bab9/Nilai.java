package tugas.bab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Nilai extends JFrame {

    Label lJudul, lTugas, lKuis, lUts, lUas, lHasil;
    TextField txtTugas, txtKuis, txtUts, txtUas, txtHasil;
    TextArea txtInfomatkul;
    ButtonGroup bg;
    JRadioButton Asd, Pemlan, Matkomlan, Probstat;
    JButton BHasil, Tampilkan;
    String hAsd = "Kosong", hPemlan = "Kosong", hMatkomlan = "Kosong", hProbstat = "kosong";

    public Nilai() {
        setLayout(null);
        setLabel();
        setButton();
        setTextfield();
        setExit();

    }

    public void setLabel() {
        lJudul = new Label("Hitung Nilai Akhir");
        lJudul.setFont(new Font("Arial", 1, 14));
        add(lJudul);
        lJudul.setBounds(160, 30, 170, 20);

        lTugas = new Label("Tugas : ");
        add(lTugas);
        lTugas.setBounds(140, 90, 80, 20);

        lKuis = new Label("Kuis : ");
        add(lKuis);
        lKuis.setBounds(140, 120, 70, 20);

        lUts = new Label("Uts : ");
        add(lUts);
        lUts.setBounds(140, 150, 70, 20);

        lUas = new Label("Uas : ");
        add(lUas);
        lUas.setBounds(140, 180, 70, 20);

        lHasil = new Label("Hasil : ");
        add(lHasil);
        lHasil.setBounds(140, 210, 70, 20);

    }

    public void setTextfield() {
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(240, 90, 60, 20);

        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(240, 120, 60, 20);

        txtUts = new TextField("0");
        add(txtUts);
        txtUts.setBounds(240, 150, 60, 20);

        txtUas = new TextField("0");
        add(txtUas);
        txtUas.setBounds(240, 180, 60, 20);

        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(240, 210, 60, 20);

        txtInfomatkul = new TextArea();
        add(txtInfomatkul);
        txtInfomatkul.setBounds(100, 280, 250, 150);

    }

    public void setButton() {

        bg = new ButtonGroup();

        Asd = new JRadioButton("ASD");
        bg.add(Asd);
        this.add(Asd).setBounds(40, 60, 90, 20);

        Pemlan = new JRadioButton("Pemlan");
        bg.add(Pemlan);
        this.add(Pemlan).setBounds(140, 60, 90, 20);

        Matkomlan = new JRadioButton("Matkomlan");
        bg.add(Matkomlan);
        this.add(Matkomlan).setBounds(240, 60, 110, 20);

        Probstat = new JRadioButton("Probstat");
        bg.add(Probstat);
        this.add(Probstat).setBounds(340, 60, 90, 20);

        BHasil = new JButton("Hitung");
        add(BHasil).setBounds(175, 250, 90, 20);;
        BHasil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HitungActionPerformed(e);
            }

        });

        Tampilkan = new JButton("Tampilkan nilai semua matkul");
        add(Tampilkan).setBounds(100, 440, 250, 20);

        Tampilkan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TampilkanActionPerformed(e);
            }
        });
    }

    public void HitungActionPerformed(ActionEvent e) {

        try{
        String hasil = null;
        double Tugas = Double.parseDouble(txtTugas.getText().trim());
        double Kuis = Double.parseDouble(txtKuis.getText().trim());
        double Uts = Double.parseDouble(txtUts.getText().trim());
        double Uas = Double.parseDouble(txtUas.getText().trim());

        Asd asd = new Asd(Tugas, Kuis, Uts, Uas);
        Pemlan pemlan = new Pemlan(Tugas, Kuis, Uts, Uas);
        Matkomlan matkomlan = new Matkomlan(Tugas, Kuis, Uts, Uas);
        Probstat probstat = new Probstat(Tugas, Kuis, Uts, Uas);
        txtTugas.setText("0");
        txtKuis.setText("0");
        txtUts.setText("0");
        txtUas.setText("0");
        txtInfomatkul.setText("");

        if (Asd.isSelected()) {
            txtHasil.setText("");
            hasil = asd.getHasil();
            hAsd = hasil;
            txtInfomatkul.setText("Nilai telah disimpan");

        } else if (Pemlan.isSelected()) {
            txtHasil.setText("");
            hasil = pemlan.getHasil();
            hPemlan = hasil;
            txtInfomatkul.setText("Nilai telah disimpan");
        } else if (Matkomlan.isSelected()) {
            txtHasil.setText("");
            hasil = matkomlan.getHasil();
            hMatkomlan = hasil;
            txtInfomatkul.setText("Nilai telah disimpan");
        } else if (Probstat.isSelected()) {
            txtHasil.setText("");
            hasil = probstat.getHasil();
            hProbstat = hasil;
            txtInfomatkul.setText("Nilai telah disimpan");
        }
        else { txtInfomatkul.setText("Silahkan pilih terlebih dahulu mata kuliahnya");
            
        }
        txtHasil.setText(hasil);

    } catch (NumberFormatException n){
        txtInfomatkul.setText("Format masukan harus angka");
    }
    }
    private void TampilkanActionPerformed(ActionEvent e) {
        txtInfomatkul.setText("Hasil nilai semua mata kuliah\n\n"
                + "ASD\t: " + hAsd
                + "\nPemlan\t: " + hPemlan
                + "\nMatkomlan\t: " + hMatkomlan
                + "\nProbstat\t: " + hProbstat);
    }

    private void setExit() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

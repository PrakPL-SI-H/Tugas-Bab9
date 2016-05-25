/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame.*;
/**
 *
 * @author Prasetyo
 */
public class GUI extends Frame {
    Checkbox cbPROBSTAT, cbASD, cbMATKOMLAN, cbPEMLAN;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    TextArea hasiltotal;
    Button btnHasil,btnHasil2;
    public String hasilASD = "0.0", hasilPemlan = "0.0", hasilMatkomlan = "0.0", hasilProbstat = "0.0";

    public GUI() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));//(nama font,bentuk font,ukuran)
        add(lbJudul);
        lbJudul.setBounds(120, 30, 140, 20);//(mengatur space dr kanan ke kiri,mengatur atas ke bawah,mengatur lebar kotak pada tulisan,mengatur tinggi pada kotak tulisan)
                
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 180, 62, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 90, 70, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 120, 70, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 150, 70, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 210, 70, 20);

        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 180, 60, 20);
        txtTugas.setBackground(Color.red);

        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 90, 60, 20);
        txtKuis.setBackground(Color.red);

        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 120, 60, 20);
        txtUTS.setBackground(Color.red);

        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 150, 60, 20);
        txtUAS.setBackground(Color.red);

        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 210, 60, 20);
        txtHasil.setBackground(Color.red);
        
        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, false);
        this.add(cbASD).setBounds(30, 60, 40, 20);

        cbPEMLAN = new Checkbox("PEMLAN", cbg, false);
        add(cbPEMLAN).setBounds(85, 60, 70, 20);

        cbMATKOMLAN = new Checkbox("MATKOMLAN", cbg, false);
        add(cbMATKOMLAN).setBounds(160, 60, 90, 20);

        cbPROBSTAT = new Checkbox("PROBSTAT", cbg, false);
        add(cbPROBSTAT);
        cbPROBSTAT.setBounds(260, 60, 70, 20);
        
        btnHasil = new Button("Hasil");//tombol hasil atas
        add(btnHasil);
        btnHasil.setBounds(140, 240, 80, 20);
        btnHasil.setBackground(Color.blue);
        
        cbASD.addItemListener(new mainAction());
        cbPEMLAN.addItemListener(new mainAction());
        cbMATKOMLAN.addItemListener(new mainAction());
        cbPROBSTAT.addItemListener(new mainAction());
        
        btnHasil.addActionListener(new Total());
        hasiltotal = new TextArea();
        this.add(hasiltotal).setBounds(40, 270, 300, 150);
        hasiltotal.setBackground(Color.red);
     
        btnHasil2 = new Button("Tampilkan Semua Nilai Matkul");//tombol hasil bwh
        add(btnHasil2);
        btnHasil2.setBounds(80, 440, 220, 20);
        btnHasil2.setBackground(Color.blue);
        btnHasil2.addActionListener(new TotalSemua());
    }
    class mainAction implements ItemListener {
 
         @Override
         public void itemStateChanged(ItemEvent e) {
             double tugas = Integer.parseInt(txtTugas.getText().trim());
             double Quiz = Integer.parseInt(txtKuis.getText().trim());
             double UTS = Integer.parseInt(txtUTS.getText().trim());
             double UAS = Integer.parseInt(txtUAS.getText().trim());
             double nilai_akhir = ((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
             String hasil = String.valueOf((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
             Object source = e.getItemSelectable();
             if (source == cbASD) {
                 txtTugas.setText("0");
                 txtKuis.setText("0");
                 txtUTS.setText("0");
                 txtUAS.setText("0");
                 txtHasil.setText("0");
                 hasilASD = hasil;
             } else if (source == cbPEMLAN) {
                 txtTugas.setText("0");
                 txtKuis.setText("0");
                 txtUTS.setText("0");
                 txtUAS.setText("0");
                 txtHasil.setText("0");
                 hasilPemlan = hasil;
             } else if (source == cbMATKOMLAN) {
                 txtTugas.setText("0");
                 txtKuis.setText("0");
                 txtUTS.setText("0");
                 txtUAS.setText("0");
                 txtHasil.setText("0");
                 hasilMatkomlan = hasil;
             } else if (source == cbPROBSTAT) {
                 txtTugas.setText("0");
                 txtKuis.setText("0");
                 txtUTS.setText("0");
                 txtUAS.setText("0");
                 txtHasil.setText("0");
                 hasilProbstat = hasil;
            }
         }
    }
    class Total implements ActionListener {
 
         @Override
         public void actionPerformed(ActionEvent ae) {
             double tugas = Integer.parseInt(txtTugas.getText().trim());
             double Quiz = Integer.parseInt(txtKuis.getText().trim());
             double UTS = Integer.parseInt(txtUTS.getText().trim());
             double UAS = Integer.parseInt(txtUAS.getText().trim());
             double nilai_akhir = ((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
             String hasil = String.valueOf((tugas * 0.2) + (Quiz * 0.3) + (UTS * 0.2) + (UAS * 0.3));
             txtHasil.setText(hasil);
         }
 
     }
    class TotalSemua implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent ae) {
             hasiltotal.setText(" HASIL NILAI AKHIR SEMUA MATA KULIAH" + "\n"
                     + "\n" + "ASD                 : " + hasilASD + "\n"
                     + "PEMLAN         : " + hasilPemlan + "\n"
                     + "MATKOMLAN : " + hasilMatkomlan + "\n"
                     + "PROBSTAT    : " + hasilProbstat + "\n \n"
                     
             );
         }
     }
}
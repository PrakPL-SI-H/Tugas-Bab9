/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

/**
 *
 * @author TEGAR
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.JFrame;
 
 public class NILAI_UJIAN extends JFrame {
 
     Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
     TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
     TextArea hasiltotal;
     CheckboxGroup cbg;
     Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
     Button btnHasil, btnHasilTotal;
     public String hasilASD = "0.0", hasilPemlan = "0.0", hasilMatkomlan = "0.0", hasilProbstat = "0.0";
 
     
     public NILAI_UJIAN() {
         setLayout(null);
         lbJudul = new Label("Hitung Nilai Akhir");
         lbJudul.setFont(new Font("Arial", 1, 14));
         add(lbJudul);
         lbJudul.setBounds(150, 20, 170, 20);
         cbg = new CheckboxGroup();
         cbASD = new Checkbox("ASD", cbg, false);
         this.add(cbASD).setBounds(10, 40, 70, 20);
         cbPemlan = new Checkbox("Pemlan", cbg, false);
         this.add(cbPemlan).setBounds(120, 40, 70, 20);
         cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
         this.add(cbMatkomlan).setBounds(250, 40, 80, 20);
         cbProbstat = new Checkbox("Probstat", cbg, false);
         this.add(cbProbstat).setBounds(400, 40, 70, 20);
         
           lbTugas = new Label("Tugas : ");
         add(lbTugas);
         lbTugas.setBounds(100, 70, 62, 20);
         lbKuis = new Label("Kuis : ");
         add(lbKuis);
         lbKuis.setBounds(100, 100, 70, 20);
         lbUTS = new Label("UTS : ");
         add(lbUTS);
         lbUTS.setBounds(100, 130, 70, 20);
         lbUAS = new Label("UAS : ");
         add(lbUAS);
         lbUAS.setBounds(100, 160, 70, 20);
         lbHasil = new Label("Hasil : ");
         add(lbHasil);
         lbHasil.setBounds(100, 190, 70, 20);
         
         txtTugas = new TextField("0");
         add(txtTugas);
         txtTugas.setBounds(200, 70, 60, 20);
         txtKuis = new TextField("0");
         add(txtKuis);
         txtKuis.setBounds(200, 100, 60, 20);
         txtUTS = new TextField("0");
         add(txtUTS);
         txtUTS.setBounds(200, 130, 60, 20);
         txtUAS = new TextField("0");
         add(txtUAS);
         txtUAS.setBounds(200, 160, 60, 20);
         txtHasil = new TextField("0");
         add(txtHasil);
         txtHasil.setBounds(200, 190, 60, 20);
         
         btnHasil = new Button("Hitung");
         add(btnHasil);
         btnHasil.setBounds(160, 220, 100, 20);
 
  cbASD.addItemListener(new mainAction());
         cbPemlan.addItemListener(new mainAction());
         cbMatkomlan.addItemListener(new mainAction());
         cbProbstat.addItemListener(new mainAction());
         
         
         btnHasil.addActionListener(new Hitung());
 
         hasiltotal = new TextArea();
         this.add(hasiltotal).setBounds(70, 260, 300, 150);
 
         btnHasilTotal = new Button("Tampilkan nilai semua matkul");
         add(btnHasilTotal);
         btnHasilTotal.setBounds(90, 430, 250, 20);
 
         btnHasilTotal.addActionListener(new hasilSemua());
         setDefaultCloseOperation(EXIT_ON_CLOSE);
     
         
     }
 }


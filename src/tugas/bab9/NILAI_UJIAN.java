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
     }
 }



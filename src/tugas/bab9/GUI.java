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
        
    }
}
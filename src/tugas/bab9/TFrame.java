/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakproglan.bab9;

/**
 *
 * @author Aldo
 */
import java.awt.*;
import java.awt.event.*;

public class TFrame extends Frame{
    Label lbTugas, lbKuis, lbUTS, lbUAS, lbHasil, lbASD, lbPemlan, lbMatkomlan, lbProbstat, lbJudul;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    TextArea txtSemua;
    Button btnHitung, btnSemua;
    CheckboxGroup cbg;  
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat; 
    String asd, pemlan, matkomlan, probstat;
    
    public TFrame(){
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
        }
        });
        
        setLayout(null);
        
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14)); 
        add(lbJudul);
        lbJudul.setBounds(140, 50, 150, 20);
        
        lbTugas = new Label("Tugas");
        add(lbTugas);
        lbTugas.setBounds(100, 115, 100, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 115, 100, 20);
        
        lbKuis = new Label("Kuis");
        add(lbKuis);
        lbKuis.setBounds(100, 145, 100, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 145, 100, 20);
        
        lbUTS = new Label("UTS");
        add(lbUTS);
        lbUTS.setBounds(100, 175, 100, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 175, 100, 20);
        
        lbUAS = new Label("UAS");
        add(lbUAS);
        lbUAS.setBounds(100, 205, 100, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 205, 100, 20);
        
        lbHasil = new Label("Hasil");
        add(lbHasil);
        lbHasil.setBounds(100, 235, 100, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 235, 100, 20);
        
        txtSemua = new TextArea();
        add(txtSemua);
        txtSemua.setBounds(50, 300, 300, 150);
        
    }
}
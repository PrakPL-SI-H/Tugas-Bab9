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
        
        btnHitung = new Button("HITUNG");
        add(btnHitung);
        btnHitung.setBounds(165, 270, 75, 20);
        btnHitung.addActionListener(new mainAction());
        btnSemua = new Button("Tampilkan Semua Nilai");
        add(btnSemua);
        btnSemua.setBounds(125, 460, 160, 20);
        btnSemua.addActionListener(new mainAction());
        
        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, false);
        this.add(cbASD).setBounds(60, 80, 75, 20);
        cbPemlan = new Checkbox("Pemlan", cbg, false);
        this.add(cbPemlan).setBounds(140, 80, 75, 20);
        cbMatkomlan= new Checkbox("Matkomlan", cbg, false);
        this.add(cbMatkomlan).setBounds(220, 80, 75, 20);
        cbProbstat = new Checkbox("Probstat", cbg, false);
        add(cbProbstat).setBounds(300, 80, 75, 20);
    }
        
        class mainAction implements ActionListener, ItemListener {         
            @Override
            public void actionPerformed(ActionEvent e) {             
                int a = Integer.parseInt(txtTugas.getText().trim());
                int b = Integer.parseInt(txtKuis.getText().trim());
                int c = Integer.parseInt(txtUTS.getText().trim());
                int d = Integer.parseInt(txtUAS.getText().trim());
                if(e.getSource() == btnHitung){
                    
                    Object source = cbg.getSelectedCheckbox();
                    
                    if(source == cbASD){
                        asd = String.valueOf((a * 0.25)+(b * 0.25)+(c * 0.2)+(d * 0.3));
                        txtHasil.setText(asd);
                    }
                    else if(source == cbPemlan){
                        pemlan = String.valueOf((a * 0.2)+(b * 0.2)+(c * 0.3)+(d * 0.3));
                        txtHasil.setText(pemlan);
                    }
                    else if(source == cbMatkomlan){
                        matkomlan = String.valueOf((a * 0.15)+(b * 0.25)+(c * 0.3)+(d * 0.3));
                        txtHasil.setText(matkomlan);
                    }
                    else if(source == cbProbstat){
                        probstat = String.valueOf((a + b + c + d) / 4);
                        txtHasil.setText(probstat);
                    }
                }
                if (e.getSource() == btnSemua){
                    txtSemua.setText("\tHASIL NILAI SEMUA MATA KULIAH\n\n"
                            + "Algoritma dan Struktur Data\t: "+asd+"\n"
                            + "Pemograman Lanjut\t\t: "+pemlan+"\n"
                            + "Matematika Komputasi Lanjut\t: "+matkomlan+"\n"
                            + "Probabilitas Statistik\t\t: "+probstat);   
                    }
                }
            
        @Override
        public void itemStateChanged(ItemEvent ie) {
        }
        }
}
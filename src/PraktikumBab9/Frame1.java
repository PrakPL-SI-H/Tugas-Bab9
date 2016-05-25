package PraktikumBab9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Frame1 extends Frame{
    ButtonGroup cbg;
    JRadioButton cbPemlan, cbASD, cbMatkom, cbProbstat;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    String asd, pemlan, matkom, probstat;
    Button btnHasil, btnTampilkan;
    TextArea tampil;
    
    public Frame1(){
        setLayout(null);    

        lbJudul = new Label("HITUNG NILAI AKHIR");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(130, 60, 170, 20);

        cbg = new ButtonGroup();
        cbASD = new JRadioButton("ASD",false);
        this.add(cbASD).setBounds(10, 90, 60, 30);
        cbASD.addItemListener(new mainAction());
        
        cbPemlan = new JRadioButton("Pemlan", false);
        this.add(cbPemlan).setBounds(80, 90, 80, 30);
        cbPemlan.addItemListener(new mainAction());

        cbMatkom = new JRadioButton("Matkomlan",  false);
        this.add(cbMatkom).setBounds(170, 90, 90, 30);
        cbMatkom.addItemListener(new mainAction());

        cbProbstat = new JRadioButton("Probstat", false);
        this.add(cbProbstat).setBounds(275, 90, 80, 30);
        cbProbstat.addItemListener(new mainAction());
        
        cbg.add(cbASD);
        cbg.add(cbPemlan);
        cbg.add(cbMatkom);
        cbg.add(cbProbstat);
        
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 130, 62, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 170, 70, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 210, 70, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 250, 70, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 290, 70, 20);

        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 130, 60, 20);

        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 170, 60, 20);

        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 210, 60, 20);

        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 250, 60, 20);

        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 290, 60, 20);
        
        tampil = new TextArea();
        add(tampil);
        tampil.setBounds(70, 350, 250, 200);

        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(120, 320, 100, 20);
        
        btnTampilkan = new Button ("Tampilkan Nilai");
        add(btnTampilkan);
        btnTampilkan.setBounds(100, 600,150,30);
        
        btnHasil.addActionListener(new mainAction());
        btnTampilkan.addActionListener(new mainAction());
    }
    class mainAction implements ActionListener, ItemListener {    
    @Override
    public void actionPerformed(ActionEvent e) {
        int tugas = Integer.parseInt(txtTugas.getText().trim());
        int kuis = Integer.parseInt(txtKuis.getText().trim());
        int UTS = Integer.parseInt(txtUTS.getText().trim());
        int UAS = Integer.parseInt(txtUAS.getText().trim());
        if(e.getSource() == btnHasil){
            if(cbASD.isSelected()){
                asd = String.valueOf((tugas + kuis + UTS + UAS) / 4);
                txtHasil.setText(asd);
            }
            else if(cbPemlan.isSelected()){
                pemlan = String.valueOf((tugas * 0.2)+(kuis * 0.2)+(UTS*0.3)+(UAS*0.3));
                txtHasil.setText(pemlan);
            }
            else if(cbMatkom.isSelected()){
                matkom = String.valueOf((tugas * 0.1)+(kuis * 0.3)+(UTS*0.3)+(UAS*0.3));
                txtHasil.setText(matkom);
            }
            else if(cbProbstat.isSelected()){
                probstat = String.valueOf((tugas * 0.25)+(kuis * 0.25)+(UTS*0.2)+(UAS*0.3));
                txtHasil.setText(probstat);
            }
        }
        if (e.getSource() == btnTampilkan){
            tampil.setText("HASIL NILAI SEMUA MATKUL\n\n"
                    + "Pemograman Lanjut : "+pemlan+"\n"
                    + "Matkom Lanjut     : "+matkom+"\n"
                    + "ASD               : "+asd+"\n"
                    + "Probstat          : "+probstat);   
        }         
    }    
        @Override
        public void itemStateChanged(ItemEvent ie) {
            txtTugas.setText("0");
            txtKuis.setText("0");
            txtUTS.setText("0");
            txtUAS.setText("0");
            txtHasil.setText("0");
        }
    }
}

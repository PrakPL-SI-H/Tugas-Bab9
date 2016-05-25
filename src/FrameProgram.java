
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JRadioButton;

public class FrameProgram extends Frame { //pemanggilan data di parent default dari java class Frame

    String[][] output = new String[4][2];//untuk outputan tampil pada textArea
    Label lbKuis, lbUTS, lbJudul, lbTugas, lbUAS, lbHasil;
    TextField txtUTS, txtTugas, txtKuis, txtUAS, txtHasil;
    CheckboxGroup centang;
    TextArea txtArea;
    Checkbox cbASD, cbProbstat, cbProglan, cbMatkomlan;
    JRadioButton cbgASD,cbgProbstat,cbgProglan,cbgMatkomlan;//pembuatan button dengan JRadioButton
    Button btnTampil, btnHasil;

    public FrameProgram() {
        setLayout(null);//agar dapat meng-set letak secara bebas di set null
        lbJudul = new Label("NILAI AKHIR MAHASISWA");
        lbJudul.setFont(new Font("Verdana", Font.BOLD, 14));
        lbJudul.setForeground(Color.BLUE);
        add(lbJudul);
        lbJudul.setBounds(125, 30, 175, 20);
        centang = new CheckboxGroup();
        cbgASD = new JRadioButton("ASD", false);
        cbASD = new Checkbox("ASD",centang, false);
        this.add(cbASD).setBounds(300, 50, 80, 20);
        cbASD.addItemListener(new main());
        cbgProbstat = new JRadioButton("Probstat", false);
        cbProbstat = new Checkbox("Probstat",centang, false);
        this.add(cbProbstat).setBounds(20, 50, 90, 20);
        cbProbstat.addItemListener(new main());
        cbgProglan = new JRadioButton("Proglan", false);
        cbProglan = new Checkbox("Proglan",centang, false);
        this.add(cbProglan).setBounds(200, 50, 90, 20);
        cbProglan.addItemListener(new main());
        cbgMatkomlan = new JRadioButton("Matkomlan", false);
        cbMatkomlan = new Checkbox("Matkomlan",centang, false);
        this.add(cbMatkomlan).setBounds(110, 50, 90, 20);
        cbMatkomlan.addItemListener(new main());
//pembuatan label untuk masing masing nilai
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(130, 80, 70, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(130, 110, 70, 20);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(130, 140, 70, 20);
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(130, 170, 62, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(130, 200, 70, 20);
//pembuatan textfield untuk masing masing nilai
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(240, 80, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(240, 110, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(240, 140, 60, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(240, 170, 60, 20);

        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(240, 200, 60, 20);

        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(160, 240, 100, 20);
        btnHasil.addActionListener(new mainAction());
        txtArea = new TextArea();
        add(txtArea);
        txtArea.setBounds(80, 270, 250, 160);

        btnTampil = new Button("SEMUA NILAI");
        add(btnTampil);
        btnTampil.setBounds(80, 450, 250, 20);
        btnTampil.addActionListener(new mainActionTampil());

    }

    class main implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent x) {
            int tugas,kuis,UTS,UAS;
            Object pilCheck = x.getItemSelectable();

            if (pilCheck == cbASD) {
                txtTugas.setText("0");
                tugas = Integer.parseInt(txtTugas.getText().trim());
                txtKuis.setText("0");
                kuis = Integer.parseInt(txtKuis.getText().trim());
                txtUTS.setText("0");
                UTS = Integer.parseInt(txtUTS.getText().trim());
                txtUAS.setText("0");
                UAS = Integer.parseInt(txtUAS.getText().trim());
                String hasil = String.valueOf((tugas + kuis + UTS + UAS) / 3);
                txtHasil.setText(hasil);

            } else if (pilCheck == cbProbstat) {
                txtTugas.setText("0");
                tugas = Integer.parseInt(txtTugas.getText().trim());
                txtKuis.setText("0");
                kuis = Integer.parseInt(txtKuis.getText().trim());
                txtUTS.setText("0");
                UTS = Integer.parseInt(txtUTS.getText().trim());
                txtUAS.setText("0");
                UAS = Integer.parseInt(txtUAS.getText().trim());
                String hasil = String.valueOf((tugas  + kuis  + UTS  + UAS) / 1);
                txtHasil.setText(hasil);
            } else if (pilCheck == cbProglan) {
                txtTugas.setText("0");
                tugas = Integer.parseInt(txtTugas.getText().trim());
                txtKuis.setText("0");
                kuis = Integer.parseInt(txtKuis.getText().trim());
                txtUTS.setText("0");
                UTS = Integer.parseInt(txtUTS.getText().trim());
                txtUAS.setText("0");
                UAS = Integer.parseInt(txtUAS.getText().trim());
                String hasil = String.valueOf((tugas  + kuis  + UTS  + UAS) / 4);
                txtHasil.setText(hasil);
            } else if (pilCheck == cbMatkomlan) {
                txtTugas.setText("0");
                tugas = Integer.parseInt(txtTugas.getText().trim());
                txtKuis.setText("0");
                kuis = Integer.parseInt(txtKuis.getText().trim());
                txtUTS.setText("0");
                UTS = Integer.parseInt(txtUTS.getText().trim());
                txtUAS.setText("0");
                UAS = Integer.parseInt(txtUAS.getText().trim());
                String hasil = String.valueOf((tugas + kuis + UTS + UAS) / 2);
                txtHasil.setText(hasil);
            }

        }
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int tugas,UTS,UAS,kuis;
            String[][] a = new String[4][2];
            tugas = Integer.parseInt(txtTugas.getText().trim());
            UTS = Integer.parseInt(txtUTS.getText().trim());
            UAS = Integer.parseInt(txtUAS.getText().trim());
            kuis = Integer.parseInt(txtKuis.getText().trim());
            
            String hasil = "";
            
            Object pilCheck = centang.getSelectedCheckbox();
            if (pilCheck == cbProbstat) {
                output[1][0] = "Probstat        ";
                hasil = String.valueOf((tugas + kuis + UTS + UAS) / 1);
                output[1][1] = hasil;
            } else if (pilCheck == cbMatkomlan) {
                
                output[0][0] = "HASIL SEMUA NILAI MATA KULIAH :\n"
                        + "Matkomlan   ";
                hasil = String.valueOf((tugas + kuis + UTS + UAS) / 2);
                output[0][1] = hasil;
            } else if (pilCheck == cbASD) {
                output[3][0] = "ASD               ";
                hasil = String.valueOf((tugas + kuis + UTS + UAS) / 3);
                output[3][1] = hasil;
            } else if (pilCheck == cbProglan) {
                output[2][0] = "Pemlan         ";
                hasil = String.valueOf((tugas + kuis + UTS + UAS) / 4);
                output[2][1] = hasil;
            }
            txtHasil.setText(hasil);
        }

    }

    class mainActionTampil implements ActionListener {
        //untuk menampilkan hasil seluruh nilai mata kuliah actionlistener untuk tombol Tampilkan Semua Nilai

        @Override
        public void actionPerformed(ActionEvent event) {
            String hasil = "";
            mainAction a = new mainAction();

            for (int i = 0; i < 4; i++) { //index ke-satu
                for (int j = 0; j < 2; j++) {//index ke-dua
                    hasil += output[i][j];
                    if (j == 0) {
                        
                        hasil += " Dengan Nilai : ";
                    }
                }
                hasil += "\n";
            }
            txtArea.setText(hasil);
        }
    }

}

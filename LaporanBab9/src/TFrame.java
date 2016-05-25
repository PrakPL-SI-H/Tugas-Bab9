import java.awt.*;
import java.awt.event.*;
public class TFrame extends Frame{
    public Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    public TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    public TextArea txtHasilSemua;
    public Checkbox varASD, varPemlan, varMatkomlan, varProbstat;
    CheckboxGroup matkul = new CheckboxGroup();
    Button hasil, hasilSemua;
    int pilihan;
    
     public TFrame() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Times New Roman", 1, 20));
        add(lbJudul);
        lbJudul.setBounds(160, 50, 170, 20);
        varPemlan = new Checkbox("Pem. Lanjut", matkul, false);
        add(varPemlan).setBounds(70, 80, 90, 20);
        varPemlan.addItemListener(new mainAction());
        varASD = new Checkbox("ASD", matkul, false);
        add(varASD).setBounds(170, 80, 90, 20);
        varASD.addItemListener(new mainAction());
        varMatkomlan = new Checkbox("Matkomlan", matkul, false);
        add(varMatkomlan).setBounds(270, 80, 90, 20);
        varMatkomlan.addItemListener(new mainAction());
        varProbstat = new Checkbox("Probstat", matkul, false);
        add(varProbstat).setBounds(370, 80, 90, 20);
        varProbstat.addItemListener(new mainAction());

        lbTugas = new Label("Tugas\t: ");
        add(lbTugas).setBounds(160, 110, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas).setBounds(260, 110, 60, 20);
        lbKuis = new Label("Kuis\t: ");
        add(lbKuis).setBounds(160, 140, 70, 20);
        txtKuis = new TextField("0");
        add(txtKuis).setBounds(260, 140, 60, 20);
        lbUTS = new Label("UTS\t: ");
        add(lbUTS).setBounds(160, 170, 70, 20);
        txtUTS = new TextField("0");
        add(txtUTS).setBounds(260, 170, 60, 20);
        lbUAS = new Label("UAS\t: ");
        add(lbUAS).setBounds(160, 200, 70, 20);
        txtUAS = new TextField("0");
        add(txtUAS).setBounds(260, 200, 60, 20);
        lbHasil = new Label("Hasil\t: ");
        add(lbHasil).setBounds(160, 230, 70, 20);
        txtHasil = new TextField("0");
        add(txtHasil).setBounds(260, 230, 60, 20);

        hasil = new Button("Hitung");
        add(hasil).setBounds(185, 260, 100, 20);
        hasil.addActionListener(new mainActionHasil());
        txtHasilSemua = new TextArea();
        add(txtHasilSemua).setBounds(50, 290, 400, 200);
        hasilSemua = new Button("Tampilkan Nilai Semua Mata Kuliah");
        add(hasilSemua).setBounds(50, 500, 400, 20);
        hasilSemua.addActionListener(new mainActionLast());
    }
    class mainAction implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent event) {
            txtTugas.setText("0");
            txtKuis.setText("0");
            txtUTS.setText("0");
            txtUAS.setText("0");
            txtHasil.setText("0");
            Object source = event.getItemSelectable();
            if (source == varPemlan) {
                pilihan = 1;
            } else if (source == varASD) {
                pilihan = 2;
            } else if (source == varMatkomlan) {
                pilihan = 3;
            } else if (source == varProbstat) {
                pilihan = 4;
            }
        }
    }
    class mainActionHasil implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            double tugas = Double.parseDouble(txtTugas.getText().trim());
            double kuis = Double.parseDouble(txtKuis.getText().trim());
            double UTS = Double.parseDouble(txtUTS.getText().trim());
            double UAS = Double.parseDouble(txtUAS.getText().trim());
            if (pilihan == 1) {
                Pemlan obPemlan = new Pemlan(tugas, kuis, UTS, UAS);
                txtHasil.setText(obPemlan.getHasil());
            } else if (pilihan == 2) {
                ASD obASD = new ASD(tugas, kuis, UTS, UAS);
                txtHasil.setText(obASD.getHasil());
            } else if (pilihan == 3) {
                Matkomlan obMatkomlan = new Matkomlan(tugas, kuis, UTS, UAS);
                txtHasil.setText(obMatkomlan.getHasil());
            } else if (pilihan == 4) {
                Probstat obProbstat = new Probstat(tugas, kuis, UTS, UAS);
                txtHasil.setText(obProbstat.getHasil());
            }
        }
    }
    class mainActionLast implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            Pemlan pl = new Pemlan();
            Matkomlan ml = new Matkomlan();
            ASD asd = new ASD();
            Probstat ps = new Probstat();
            txtHasilSemua.setText("\t\tHasil Nilai Semua Mata Kuliah\n"
                    + "\nPemrograman Dasar\t\t: " + pl.getHasil()
                    + "\nASD\t\t\t\t: " + asd.getHasil()
                    + "\nMatematika Komputasi Lanjut\t: " + ml.getHasil()
                    + "\nProbabilitas dan Statistika\t\t: " + ps.getHasil());
        }
    }

}

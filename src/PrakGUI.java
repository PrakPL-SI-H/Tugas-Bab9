package GUI;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class PrakGUI extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil, lbMatkomLan, lbAsd, lbPemlan, lbProbstat;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, outputHasil;
    String nilaiAsd, nilaiMatkomLan, nilaiPemlan, nilaiProbstat;
    ButtonGroup bg;
    JRadioButton cbMatkomLan, cbAsd, cbPemlan, cbProbstat;
    Button hasil, totalHasil;
    TextArea tampil;

    public PrakGUI() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setBounds(160, 50, 200, 30);
        lbJudul.setFont(new Font("Arial", Font.BOLD, 14));
        add(lbJudul);
        bg = new ButtonGroup();

        cbAsd = new JRadioButton("ASD");
        cbAsd.setFont(new Font("Arial", Font.PLAIN, 14));
        this.add(cbAsd).setBounds(20, 100, 80, 20);
        bg.add(cbAsd);

        cbPemlan = new JRadioButton("Pemlan");
        this.add(cbPemlan).setBounds(100, 100, 100, 20);
        cbPemlan.setFont(new Font("Arial", Font.PLAIN, 14));
        bg.add(cbPemlan);

        cbMatkomLan = new JRadioButton("MatkomLan");
        this.add(cbMatkomLan).setBounds(200, 100, 120, 20);
        cbMatkomLan.setFont(new Font("Arial", Font.PLAIN, 14));
        bg.add(cbMatkomLan);

        cbProbstat = new JRadioButton("Probstat");
        this.add(cbProbstat).setBounds(320, 100, 90, 20);
        cbProbstat.setFont(new Font("Arial", Font.PLAIN, 14));
        bg.add(cbProbstat);

        lbTugas = new Label("Tugas :");
        lbTugas.setBounds(120, 150, 100, 25);
        lbTugas.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbTugas);

        lbKuis = new Label("Kuis :");
        lbKuis.setBounds(120, 180, 100, 25);
        lbKuis.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbKuis);

        lbUTS = new Label("UTS :");
        lbUTS.setBounds(120, 210, 100, 25);
        lbUTS.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbUTS);

        lbUAS = new Label("UAS :");
        lbUAS.setBounds(120, 240, 100, 25);
        lbUAS.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbUAS);

        lbHasil = new Label("Hasil :");
        lbHasil.setBounds(120, 270, 100, 25);
        lbHasil.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbHasil);

        txtTugas = new TextField();
        txtTugas.setBounds(250, 150, 80, 25);
        add(txtTugas);

        txtKuis = new TextField();
        txtKuis.setBounds(250, 180, 80, 25);
        add(txtKuis);

        txtUTS = new TextField();
        txtUTS.setBounds(250, 210, 80, 25);
        add(txtUTS);

        txtUAS = new TextField();
        txtUAS.setBounds(250, 240, 80, 25);
        add(txtUAS);
        outputHasil = new TextField();
        outputHasil.setBounds(250, 270, 80, 25);
        add(outputHasil);

        hasil = new Button("Hitung");
        hasil.setBounds(180, 300, 100, 25);
        add(hasil);
        aktivHasil();

        totalHasil = new Button("Tampilkan nilai semua matkul");
        totalHasil.setBounds(120, 520, 200, 30);
        add(totalHasil);
        aktivTotalHasil();
        tampil = new TextArea();
        tampil.setBounds(100, 350, 250, 150);
        add(tampil);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void aktivHasil() {
        hasil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tugas = Integer.parseInt(txtTugas.getText().trim());
                int kuis = Integer.parseInt(txtKuis.getText().trim());
                int UTS = Integer.parseInt(txtUTS.getText().trim());
                int UAS = Integer.parseInt(txtUAS.getText().trim());
                String hasil = String.valueOf((tugas + kuis + UTS + UAS) / 4);
                if (cbAsd.isSelected()) {
                    outputHasil.setText(hasil);
                    nilaiAsd = outputHasil.getText();
                } else if (cbPemlan.isSelected()) {
                    outputHasil.setText(hasil);
                    nilaiPemlan = outputHasil.getText();
                } else if (cbMatkomLan.isSelected()) {
                    outputHasil.setText(hasil);
                    nilaiMatkomLan = outputHasil.getText();
                } else if (cbProbstat.isSelected()) {
                    outputHasil.setText(hasil);
                    nilaiProbstat = outputHasil.getText();
                }
            }
        });
    }

    public void aktivTotalHasil() {
        totalHasil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tampil.setText("HASIL NILAI SEMUA MATA KULIAH\n"
                        + "\nPemlan\t      : " + nilaiPemlan
                        + "\nASD\t      : " + nilaiAsd
                        + "\nMatkomlan  : " + nilaiMatkomLan
                        + "\nProbstat\t      : " + nilaiProbstat);
            }
        });
    }
}
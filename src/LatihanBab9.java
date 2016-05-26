import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class guiKuliah extends JFrame {
Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
JRadioButton jrbASD, jrbPemlan, jrbMatkomlan, jrbProbstat;
String hasilASD, hasilPemlan, hasilMatkomlan, hasilProbstat;
ButtonGroup btg;
JTextArea jtxtArea;
JButton hitung, tampil;
public guiKuliah() {
setLayout(null);
lbJudul = new Label("Hitung Nilai Akhir Mahasiswa");
lbJudul.setFont(new Font("Arial", 1, 14));
add(lbJudul);
lbJudul.setBounds(140, 30, 210, 20);
btg = new ButtonGroup();
jrbASD = new JRadioButton("ASD");
this.add(jrbASD).setBounds(30, 60, 90, 20);
jrbMatkomlan = new JRadioButton("Matkomlan");
this.add(jrbMatkomlan).setBounds(130, 60, 90, 20);
jrbPemlan = new JRadioButton("Pemlan");
this.add(jrbPemlan).setBounds(230, 60, 90, 20);
jrbProbstat = new JRadioButton("Probstat");
this.add(jrbProbstat).setBounds(330, 60, 90, 20);
btg.add(jrbASD);
btg.add(jrbMatkomlan);
btg.add(jrbPemlan);
btg.add(jrbProbstat);
lbTugas = new Label("Tugas : ");
add(lbTugas);
lbTugas.setBounds(100, 80, 62, 20);
lbKuis = new Label("Kuis : ");
add(lbKuis);
lbKuis.setBounds(100, 110, 70, 20);
lbUTS = new Label("UTS : ");
add(lbUTS);
lbUTS.setBounds(100, 140, 70, 20);
lbUAS = new Label("UAS : ");
add(lbUAS);
lbUAS.setBounds(100, 170, 70, 20);
lbHasil = new Label("Hasil : ");
add(lbHasil);
lbHasil.setBounds(100, 200, 70, 20);
txtTugas = new TextField(" ");
add(txtTugas);
txtTugas.setBounds(200, 80, 60, 20);
txtKuis = new TextField(" ");
add(txtKuis);
txtKuis.setBounds(200, 110, 60, 20);
txtUTS = new TextField(" ");
add(txtUTS);
txtUTS.setBounds(200, 140, 60, 20);
txtUAS = new TextField(" ");
add(txtUAS);
txtUAS.setBounds(200, 170, 60, 20);
txtHasil = new TextField("0");
add(txtHasil);
txtHasil.setBounds(200, 200, 60, 20);
hitung = new JButton("Hitung");
add(hitung);
hitung.setBounds(100, 240, 100, 20);
hitung.addMouseListener(new guiKuliah.moslistener());
tampil = new JButton("Tampil");
add(tampil);
tampil.setBounds(200, 240, 100, 20);
tampil.addMouseListener(new guiKuliah.tampil());
jtxtArea = new JTextArea();
add(jtxtArea);
jtxtArea.setBounds(60, 300, 350, 240);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
show();
}

class moslistener extends MouseAdapter {
public void mouseClicked(MouseEvent e) {
int tugas = Integer.parseInt(txtTugas.getText().trim());
int kuis = Integer.parseInt(txtKuis.getText().trim());
int UTS = Integer.parseInt(txtUTS.getText().trim());
int UAS = Integer.parseInt(txtUAS.getText().trim());
if (jrbASD.isSelected()) {
hasilASD = String.valueOf(tugas / 8 + kuis / 4 + UTS / 2 + UAS / 6);
txtHasil.setText(hasilASD);
}
if (jrbPemlan.isSelected()) {
hasilPemlan = String.valueOf(tugas / 6 + kuis / 4 + UTS / 4 + UAS / 2);
txtHasil.setText(hasilPemlan);
}
if (jrbMatkomlan.isSelected()) {
hasilMatkomlan = String.valueOf(tugas / 4 + kuis / 4 + UTS / 2 + UAS / 6);
txtHasil.setText(hasilMatkomlan);
}
if (jrbProbstat.isSelected()) {
hasilProbstat = String.valueOf(tugas / 8 + kuis / 4 + UTS / 4 + UAS / 8);
txtHasil.setText(hasilProbstat);
}
}
}


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

        

    }


}

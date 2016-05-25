package tugasgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Frame1 extends JFrame {

    String hASD, hPemlan, hMatkomlan, hProbstat;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    ButtonGroup cbg;
    JRadioButton cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHitung, btnHasil;
    TextArea txaHasil;

    public Frame1() {
        setLayout(null);

        //membuat judul
        lbJudul = new Label("Hitung Nilai Akhir Felix");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        //membuat checkbox
        cbASD = new JRadioButton("ASD", false);
        this.add(cbASD).setBounds(20, 70, 50, 20);
        cbPemlan = new JRadioButton("Pemlan",false);
        this.add(cbPemlan).setBounds(80, 70, 70, 20);
        cbMatkomlan = new JRadioButton("Matkomlan",false);
        this.add(cbMatkomlan).setBounds(160, 70, 90, 20);
        cbProbstat = new JRadioButton("Probstat",  false);
        this.add(cbProbstat).setBounds(260, 70, 90, 20);
        
        //membuat group untuk checkbox
        cbg = new ButtonGroup();
        cbg.add(cbASD);
        cbg.add(cbPemlan);
        cbg.add(cbMatkomlan);
        cbg.add(cbProbstat);

        
}

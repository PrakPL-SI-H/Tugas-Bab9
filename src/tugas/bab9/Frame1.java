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

        
}

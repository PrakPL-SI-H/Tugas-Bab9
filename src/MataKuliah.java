package Praktikum9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MataKuliah extends JFrame {

    Label lbJudul, lbTugas, lbQuiz, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtQuiz, txtUTS, txtUAS, txtHasil;
    TextArea hasilsemua;
    CheckboxGroup cbg;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHasil, btnSemua;
    public String hasilASD = "0.0", hasilPemlan = "0.0", hasilMatkomlan = "0.0", hasilProbstat = "0.0";

}

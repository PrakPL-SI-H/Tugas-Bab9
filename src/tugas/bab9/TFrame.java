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
    }
}
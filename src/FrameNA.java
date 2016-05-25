
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class FrameNA extends Frame {

    JRadioButton rbASD, rbPemlan, rbMatkomlan, rbProbstat;
    ButtonGroup rbg;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHitung, btnTampil;
    TextArea taNilai;
    String asd = "-", pemlan = "-", matkomlan = "-", probstat = "-";

    public FrameNA() {
        setLayout(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);
    }
}

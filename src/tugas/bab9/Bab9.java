package bab9;
import java.awt.Color;
/**
 *
 * @author Prasetyo
 */
public class Bab9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI window = new GUI();
        window.setTitle("Nilai");
        window.setSize(370, 500);
        window.setBackground(Color.orange);
        window.setForeground(Color.white);
        window.show();
    }    
}
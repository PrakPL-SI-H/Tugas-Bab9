//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package tugasgui;

public class Pemlan {
    
    double hasil;
    
    public void setHasil(double tugas, double kuis, double UTS, double UAS) {
        hasil = tugas * 0.2 + kuis * 0.2 + UTS * 0.2 + UAS * 0.4;
        
    }
    public double getHasil(){
        return hasil;
    }
}

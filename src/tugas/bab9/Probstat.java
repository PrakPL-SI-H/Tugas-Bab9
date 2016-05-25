//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package tugasgui;

public class Probstat {
    
    double hasil;
    
    public void setHasil(double tugas, double kuis, double UTS, double UAS) {
        hasil = tugas * 0.2 + kuis * 0.2 + UTS * 0.3 + UAS * 0.3;
        
    }
    public double getHasil(){
        return hasil;
    }
}

//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package tugasgui;

public class ASD {

    double hasil;
    
    public void setHasil(double tugas, double kuis, double UTS, double UAS) {
        hasil = tugas * 0.1 + kuis * 0.2 + UTS * 0.3 + UAS * 0.4;
        
    }
    public double getHasil(){
        return hasil;
    }
}

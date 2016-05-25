//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package tugasgui;

public class Matkomlan {

    double hasil;

    public void setHasil(double tugas, double kuis, double UTS, double UAS) {
        hasil = tugas * 0.1 + kuis * 0.1 + UTS * 0.4 + UAS * 0.4;
    }

    public double getHasil() {
        return hasil;
    }
}

package tugas.bab9;

public class Pemlan {

    String hasil;

    public Pemlan(double Tugas, double Kuis, double Uts, double Uas) {
        hasil = String.valueOf((Tugas * 0.3) + (Kuis * 0.2) + (Uts * 0.1) + (Uas * 0.4));

    }

    public String getHasil() {
        return hasil;
    }
}

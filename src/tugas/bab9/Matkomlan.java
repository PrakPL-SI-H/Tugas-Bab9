package tugas.bab9;

public class Matkomlan {

    String hasil;

    public Matkomlan(double Tugas, double Kuis, double Uts, double Uas) {
        hasil = String.valueOf((Tugas * 0.1) + (Kuis * 0.4) + (Uts * 0.1) + (Uas * 0.4));

    }

    public String getHasil() {
        return hasil;
    }
}

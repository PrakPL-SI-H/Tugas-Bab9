package tugas.bab9;

public class Probstat {

    String hasil;

    public Probstat(double Tugas, double Kuis, double Uts, double Uas) {
        hasil = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (Uts * 0.25) + (Uas * 0.25));

    }

    public String getHasil() {
        return hasil;
    }
}

package tugas.bab9;

public class Asd {

    String hasil;

    public Asd(double Tugas, double Kuis, double Uts, double Uas) {
        hasil = String.valueOf((Tugas * 0.25) + (Kuis * 0.25) + (Uts * 0.1) + (Uas * 0.4));

    }

    public String getHasil() {
        return hasil;
    }

}

package maingui;

public class Matkomlan extends MatKul {

    public Matkomlan() {
    }

    public Matkomlan(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    public int getTugas() {
        return super.getTugas();
    }

    public int getKuis() {
        return super.getKuis();
    }

    public int getUTS() {
        return super.getUTS();
    }

    public int getUAS() {
        return super.getUAS();
    }

    public double getHasil() {
        return super.getHasil();
    }

    public double nilaiAkhir() {
        double tugas = getTugas() * 0.2;
        double kuis = getKuis() * 0.2;
        double uts = getUTS() * 0.3;
        double uas = getUAS() * 0.3;
        return (tugas + kuis + uts + uas);
    }
}

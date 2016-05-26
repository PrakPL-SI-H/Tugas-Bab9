package maingui;

public class ASD extends MatKul {

    public ASD() {
    }

    public ASD(int tugas, int kuis, int uts, int uas) {
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
        double tugas = getTugas() * 0.1;
        double kuis = getKuis() * 0.1;
        double uts = getUTS() * 0.4;
        double uas = getUAS() * 0.4;
        return (tugas + kuis + uts + uas);
    }
}

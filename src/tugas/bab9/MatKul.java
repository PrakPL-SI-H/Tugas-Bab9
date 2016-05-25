package maingui;

public abstract class MatKul {

    private int tugas = 0;
    private int kuis = 0;
    private int uts = 0;
    private int uas = 0;
    private double hasil;

    public MatKul() {
    }

    public MatKul(int tugas, int kuis, int uts, int uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        hasil = 0;
    }

    public int getTugas() {
        return tugas;
    }

    public int getKuis() {
        return kuis;
    }

    public int getUTS() {
        return uts;
    }

    public int getUAS() {
        return uas;
    }

    public double getHasil() {
        return nilaiAkhir();
    }

    public abstract double nilaiAkhir();
}

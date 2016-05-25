package GUI;

public abstract class Nilai {

    private int tugas = 0;
    private int kuis = 0;
    private int uts = 0;
    private int uas = 0;
    private double result;

    public Nilai() {}

    public Nilai(int tugas, int kuis, int uts, int uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        result = 0;
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

    public double getResult() {
        return nilaiakhir();
    }

    public abstract double nilaiakhir();
}

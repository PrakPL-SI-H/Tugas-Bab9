public abstract class MK {
    private int tugas = 0;
    private int kuis = 0;
    private int uts = 0;
    private int uas = 0;
    private double result;
    public MK() {
    }
    public MK(int t, int k, int ts, int as) {
        tugas = t;
        kuis = k;
        uts = ts;
        uas = as;
        result=0;
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
        return nilaiakhir();
    }
    public abstract double nilaiakhir();
}

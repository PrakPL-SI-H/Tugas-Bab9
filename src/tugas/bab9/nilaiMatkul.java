
package mainframe;
public abstract class nilaiMatkul {

    private int tugas = 0;
    private int kuis = 0;
    private int uts = 0;
    private int uas = 0;
    private double result;

    public nilaiMatkul() {
    }

    public nilaiMatkul(int t, int k, int ts, int as) {
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

    public double getResult() {
        return nilaiakhir();
    }

    public abstract double nilaiakhir();
}


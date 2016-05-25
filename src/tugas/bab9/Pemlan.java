public class Pemlan extends MK {
    public Pemlan() {
    }
    public Pemlan(int t, int k, int ts, int as) {
        super(t, k, ts, as);
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
    public double nilaiakhir() {
        double tugas = getTugas() * 0.15;
        double kuis = getKuis() * 0.25;
        double uts = getUTS() * 0.3;
        double uas = getUAS() * 0.3;
        return (tugas + kuis + uts + uas);
    }
}

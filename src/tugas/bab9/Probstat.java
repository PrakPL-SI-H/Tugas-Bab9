public class Probstat extends MK {
    public Probstat() {
    }
    public Probstat(int t, int k, int ts, int as) {
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
    public double getHasil(){
        return super.getHasil();
    }
    public double nilaiakhir() {
        double tugas=getTugas()*0.1;
        double kuis=getKuis()*0.1;
        double uts=getUTS()*0.4;
        double uas=getUAS()*0.4;
        return (tugas+kuis+uts+uas);
    }
}

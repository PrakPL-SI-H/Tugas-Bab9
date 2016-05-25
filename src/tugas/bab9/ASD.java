
package mainframe;
public class ASD extends nilaiMatkul {

    public ASD() {
    }

    public ASD(int t, int k, int ts, int as) {
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

    public double getResult(){
        return super.getResult();
    }

    public double nilaiakhir() {
        double tugas=getTugas()*0.1;
        double kuis=getKuis()*0.2;
        double uts=getUTS()*0.3;
        double uas=getUAS()*0.4;
        return (tugas+kuis+uts+uas);
    }
}


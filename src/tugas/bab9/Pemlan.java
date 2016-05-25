package tugas.bab9;

/**
 *
 * @author HP
 */
public class Pemlan {

    String hasil;

    public Pemlan(String txtTugas, String txtKuis, String txtUTS, String txtUAS) {

        double tugas = Double.parseDouble(txtTugas);
        double kuis = Double.parseDouble(txtKuis);
        double UTS = Double.parseDouble(txtUTS);
        double UAS = Double.parseDouble(txtUAS);
        hasil = String.valueOf((tugas + kuis + UTS + UAS) / 4);
    }

    public String getHasil() {
        return hasil;
    }
}


public class Pemlan extends FrameNA {

    public Pemlan(double tugas, double kuis, double UTS, double UAS) {
        nPemlan = String.valueOf((tugas * 0.1) + (kuis * 0.3) + (UTS * 0.3) + (UAS * 0.3));
    }

    public String getHasil() {
        return nPemlan;
    }
}

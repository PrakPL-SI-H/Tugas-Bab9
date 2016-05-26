
public class Probstat extends FrameNA {

    public Probstat(double tugas, double kuis, double UTS, double UAS) {
        nProbstat = String.valueOf((tugas * 0.3) + (kuis * 0.2) + (UTS * 0.25) + (UAS * 0.25));
    }

    public String getHasil() {
        return nProbstat;
    }
}

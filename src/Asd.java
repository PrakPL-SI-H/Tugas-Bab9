
public class Asd extends FrameNA {

    public Asd(double tugas, double kuis, double UTS, double UAS) {
        nAsd = String.valueOf((tugas + kuis + UTS + UAS) / 4);
    }

    public String getHasil() {
        return nAsd;
    }
}

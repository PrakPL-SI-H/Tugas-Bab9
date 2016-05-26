
public class Matkomlan extends FrameNA {

    public Matkomlan(double tugas, double kuis, double UTS, double UAS) {
        nMatkomlan = String.valueOf((tugas * 0.1) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.4));
    }

    public String getHasil() {
        return nMatkomlan;
    }
}

public class Probstat {
    static double hasil; 
    Probstat(double a, double b, double c, double d) {
        hasil = (a * 0.10) + (b * 0.40) + (c * 0.25) + (d * 0.25);
    }
     public String getHasil() {
        return String.valueOf(hasil);
    }
}

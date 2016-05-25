public class ASD {
    static double hasil; 
     public ASD(){     
    }
    public ASD(double a, double b, double c, double d) {
        hasil = (a * 0.20) + (b * 0.30) + (c * 0.20) + (d * 0.30);
    }
     public String getHasil() {
        return String.valueOf(hasil);
    }
}

public class Pemlan {
    static double hasil;
    public Pemlan(){     
    }
     public Pemlan(double a, double b, double c, double d){
        hasil = (a * 0.15) + (b * 0.35) + (c * 0.25) +(d * 0.25);
    }
     public String getHasil(){
        return String.valueOf(hasil);
    }
}

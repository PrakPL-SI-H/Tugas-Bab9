public class Matkomlan {
    static double hasil;
       public Matkomlan(){
    }
     public Matkomlan(double a, double b, double c, double d) {
        hasil = (a * 0.10) + (b * 0.40) + (c * 0.20) + (d * 0.30);
    }
        public String getHasil() {
        return String.valueOf(hasil);
    }
}

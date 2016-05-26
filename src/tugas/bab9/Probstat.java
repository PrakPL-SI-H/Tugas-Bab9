package Bab9;

public class Probstat extends HitungNilai {

    public double getProbstat() {
        double hasil = ((HitungNilai.tugas + HitungNilai.kuis + HitungNilai.UTS + HitungNilai.UAS) / 4);
        return hasil;
    }
}

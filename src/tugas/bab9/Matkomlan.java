/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9;

public class Matkomlan extends HitungNilai {

    public double getMatkomlan() {
        double hasil = ((HitungNilai.tugas + HitungNilai.kuis + HitungNilai.UTS + HitungNilai.UAS) / 4);
        return hasil;
    }
}

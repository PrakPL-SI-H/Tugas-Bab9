/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9;

public class ASD extends Nilai {

    public double getASD() {
        double hasil = ((Nilai.tugas + Nilai.kuis + Nilai.UTS + Nilai.UAS) / 4);
        return hasil;
    }
}

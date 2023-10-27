/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan26waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan26WaktuSaatIni {
  public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date waktuSaatIni = new Date();

        // Menggunakan SimpleDateFormat untuk memformat waktu dalam format yang diinginkan
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        String waktuDiformat = sdf.format(waktuSaatIni);

        // Menampilkan waktu saat ini
        System.out.println("Hari ini adalah hari: " + waktuDiformat);
    }
}

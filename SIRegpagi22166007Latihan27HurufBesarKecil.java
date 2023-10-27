/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan27HurufBesarKecil {
public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kalimat
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // Meminta pengguna untuk memilih format huruf
        System.out.print("Pilih format huruf (besar/kecil): ");
        String pilihanFormat = input.nextLine();

        // Mengganti format huruf sesuai pilihan pengguna
        String hasil = null;
        if (pilihanFormat.equalsIgnoreCase("besar")) {
            hasil = kalimat.toUpperCase();
        } else if (pilihanFormat.equalsIgnoreCase("kecil")) {
            hasil = kalimat.toLowerCase();
        } else {
            System.out.println("Pilihan format tidak valid.");
            input.close();
            return;
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);

        // Menutup objek Scanner
        input.close();
    }
}
  
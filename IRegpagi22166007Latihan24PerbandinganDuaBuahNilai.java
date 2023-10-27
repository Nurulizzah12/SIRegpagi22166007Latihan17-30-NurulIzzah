/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.iregpagi22166007latihan24perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class IRegpagi22166007Latihan24PerbandinganDuaBuahNilai {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = input.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktivitas ? (Ya/Tidak): ");
            String ulangi = input.next().toLowerCase();

            if (!ulangi.equals("ya")) {
                break;
            }
        } while (true);

        input.close();
    }
}

}
   
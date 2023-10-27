/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan21programrata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan21ProgramRataRataNilai {
public static void main(String[] args) {
        // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyakMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai: ");
        banyakMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyakMahasiswa;
        
        // Output rata-rata
        System.out.println("Rata-rata nilai adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : NurulIzzah");
    }
}
    
    

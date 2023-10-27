/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.si.regpagi.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan17ProgramTunjangan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan, totalGaji;
        String statusMenikah;

        System.out.print("Program Tunjangan\n");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = input.nextDouble();
        input.nextLine();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        statusMenikah = input.nextLine();

        if (statusMenikah.equalsIgnoreCase("menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }

        totalGaji = gajiPokok + tunjangan;

        System.out.println("\n--------Hasil Perhitungan Gaji Anda--------");
        System.out.printf("Gaji Pokok\t: Rp %.1f\n", gajiPokok);
        System.out.printf("Tunjangan\t: Rp %.1f\n", tunjangan);
        System.out.printf("Total Gaji\t: Rp %.1f\n", totalGaji);
    }
}
    
}

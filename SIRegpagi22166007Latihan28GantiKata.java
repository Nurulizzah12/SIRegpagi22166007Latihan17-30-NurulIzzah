/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan28GantiKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Mengganti Kata====");
        System.out.println("Masukkan Kalimat:");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata: ");
        String kataLama = input.next();

        System.out.print("Menjadi Kata: ");
        String kataBaru = input.next();

        // Replace the old word with the new word in the sentence
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);

        input.close();
    }
}

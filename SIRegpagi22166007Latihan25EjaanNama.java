/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;
package com.mycompany.siregpagi22166007latihan25ejaannama;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan25EjaanNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = input.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }

        input.close();
    }
}

    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan22perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diameter, radius, area, circumference;

        System.out.println("======Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran: ");
        
        while (true) {
            if (input.hasNextDouble()) {
                diameter = input.nextDouble();
                if (diameter > 0) {
                    radius = diameter / 2;
                    area = Math.PI * Math.pow(radius, 2);
                    circumference = 2 * Math.PI * radius;

                    System.out.println("======Hasil Perhitungan Lingkaran=====");
                    System.out.println("Jari-jari Lingkaran = " + radius + " cm");
                    System.out.println("Luas Lingkaran = " + String.format("%.2f", area) + " cm²");
                    System.out.println("Keliling Lingkaran = " + String.format("%.2f", circumference) + " cm");
                    break;
                }
            }
            System.out.println("Masukkan nilai diameter tidak sesuai. Nilai diameter harus berupa angka positif.");
            input.nextLine(); // Consume the invalid input
        }

        input.close();
    }
}

    

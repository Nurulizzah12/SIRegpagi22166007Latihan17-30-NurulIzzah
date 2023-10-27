package com.mycompany.siregpagi22166007latihan23nilaiterbesardanterkecil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan23NilaiTerbesardanTerkecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = input.nextLine();

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        n = input.nextInt();

        int[] nilaiMahasiswa = new int[n];
        int maxNilai = Integer.MIN_VALUE;
        int minNilai = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            int nilai = input.nextInt();
            nilaiMahasiswa[i] = nilai;

            if (nilai > maxNilai) {
                maxNilai = nilai;
            }

            if (nilai < minNilai) {
                minNilai = nilai;
            }
        }

        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("Nilai Terbesar adalah " + maxNilai);
        System.out.println("Nilai Terkecil adalah " + minNilai);
        System.out.println("Petugas " + petugas);

        input.close();
    }
}

    
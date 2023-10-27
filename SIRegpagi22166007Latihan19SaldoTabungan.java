/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan19saldotabungan;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan19SaldoTabungan {
     public static void main(String[] args) {
        double initialBalance = 2500000; // Initial balance
        double monthlyInterestRate = 0.15; // Monthly interest rate (15%)
        int months = 6; // Duration in months

        for (int i = 1; i <= months; i++) {
            // Calculate the balance for each month
            double balance = initialBalance * Math.pow(1 + monthlyInterestRate, i);
            System.out.printf("Saldo di bulan ke-%d Rp%.2f%n", i, balance);
        }
    }
}

    }
}

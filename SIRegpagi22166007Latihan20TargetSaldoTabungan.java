/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan20targetsaldotabungan;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
 
        double initialBalance = 3500000; // Initial balance
        double monthlyInterestRate = 0.08; // Monthly interest rate (8%)
        double targetBalance = 6000000; // Target balance

        int months = 0;
        double balance = initialBalance;

        while (balance < targetBalance) {
            months++;
            balance += balance * monthlyInterestRate;
            System.out.printf("Saldo di bulan ke-%d Rp%.2f%n", months, balance);
        }
    }
}

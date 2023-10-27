/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siregpagi22166007latihan30cakep;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class SIRegpagi22166007Latihan30Cakep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini? Jawab (Yoi/Enggak) :");
        String answer = input.next();

        if (answer.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep bro!");
        } else {
            System.out.println("Tetep cakep sih.");
            System.out.println("sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        }

        input.close();
    }
}

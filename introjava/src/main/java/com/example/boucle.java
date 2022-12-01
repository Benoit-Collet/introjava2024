package com.example;

import java.util.Random;
import java.util.Scanner;

public class boucle {
    public static void main(String args[]) {

        int victoire = 20;
        int numeroDeCase = 0;
        int nbLancer = 5;
        boolean gagner = false;

        while (!gagner) {
            numeroDeCase = 0;
            for (int i = 1; i <= nbLancer; i++) {
                Random generateur = new Random();
                int lancer = generateur.nextInt(6) + 1;
                numeroDeCase = numeroDeCase + lancer;
                System.out.println("Vous avez fait " + lancer);

            }
            if (numeroDeCase == victoire) {
                System.out.println("Bravo vous avez gagner!");
                gagner = true;
            } else {
                System.out.println("Vous avez perdu!");
            }
            System.out.println("Vous etes sur la casse : " + numeroDeCase);
        }
    }
}
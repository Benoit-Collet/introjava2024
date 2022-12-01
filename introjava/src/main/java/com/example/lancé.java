package com.example;

import java.util.Random;
import java.util.Scanner;

public class lancé {
    public static void main(String args[]) {

        int nb1 = 10;
        int nb2 = 2;

        System.out.println(nb1 + nb2);
        System.out.println("nb1 + nb2");
        System.out.println(nb1 + "," + nb2);

        if (nb1 <= nb2) {
            System.out.println("ici");
        }

        nb2 = nb1 + nb2;

        if (nb1 > nb2) {
            nb1 = 0;
            System.out.println("là");
        } else {
            nb2 = 0;
            System.out.println("coucou");
        }
        if (nb1 > nb2) {
            // sdfsdf
            System.out.println("101");
        } else if (nb1 == nb2) {
            System.out.println("102");
        } else {
            System.out.println("102");
        }
    }
}
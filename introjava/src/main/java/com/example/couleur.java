package com.example;
import java.util.Scanner;
public class couleur {
public static void main (String [] argss) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quelle couleur souhaitez-vous ?");
        String colour = scan.nextLine();
        if (colour.equals("r")){
            System.out.println("voici la couleur rouge!");
        }
        else if (colour.equals("b")){
            System.out.println("voici la couleur bleu!");
        }
        else if (colour.equals("v")){
            System.out.println("voici la couleur vert!");
        }
        else {
            System.out.println("Je ne connait pas cette couleur.");
        }
        scan.close();
    }
}

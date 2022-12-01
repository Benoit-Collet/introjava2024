package com.example;
import java.util.Scanner;

public class exodiapo {
    public static void main (String [] argss) { 
        // Récupérer le nombre de pieces 
            Scanner scan = new Scanner(System.in);
            System.out.println("Entrez le nombre de pièces de 1 : ");
            int un = scan.nextInt();
            System.out.println("Entrez le nombre de pièces de 5 : ");
            int cinq = scan.nextInt()*5;
            System.out.println("Entrez le nombre de pièces de 10 : ");
            int dix = scan.nextInt()*10;
            System.out.println("Entrez le nombre de pièces de 20 : ");
            int vingt = scan.nextInt()*20;
            System.out.println("Entrez le nombre de pièces de 50 : ");
            int cinquante = scan.nextInt()*50;
    
            scan.close();
            
            int sum = un + cinq+ dix + vingt +cinquante;
            int diff = (100-sum>0) ? 100-sum : sum-100;
    
            if (sum == 100){
                System.out.println("Vous avez exactement de quoi vous payer le café !");
            }
            else if (sum <= 100){
                System.out.println("Il vous manque " + (diff) + "pour prendre un café.");
            }
            else{
                System.out.println("Il vous restera "+ (diff) + "cents après avoir pris votre café !");
            }

    }
    public static void couleur (String [] argss) { 
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
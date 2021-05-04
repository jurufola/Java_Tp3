package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int number, randomNumber;
        int nbTimes = 0;
        randomNumber = 1 + (int)(Math.random() * ((100 - 1) + 1)); // Nombre aléaroire entre 1 et 100
        Scanner sc = new Scanner(System.in);
        //System.out.println("Le nombre à deviner est " + randomNumber);
        System.out.println("Veuillez deviner le nombre mystère entre 1 et 100");
        number = 1000;//Une première valeur à number afin de pouvoir tester la condition de la boucle while
        while (number!=randomNumber){
            number = sc.nextInt();
            nbTimes++;
            if (number>randomNumber){
                System.out.println("Vous êtes au dessus");
            }
            if (number<randomNumber){
                System.out.println("Vous êtes en dessous");
            }
        }
        System.out.println("Bravo, vous avez trouvé en " + nbTimes + " coups");
    }
}

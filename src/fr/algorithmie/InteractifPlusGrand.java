package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = 0;
        Scanner sc = new Scanner(System.in);

        //Lecture des valeurs
        for (int i = 0; i < array.length; i++) {
            System.out.println("Veuillez saisir une valeur : ");
            array[i] = sc.nextInt();
        }

        //Affichage
        for (int value : array) {
            System.out.println(value);
        }

        // Calcul max
        max = array[0];// On initialise le max avec le premier élément
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println(" Le plus grand des nombres saisis est : " + max);

    }
}

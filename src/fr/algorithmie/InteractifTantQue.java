package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
        number = sc.nextInt();
        while (number<=1 || number >= 10) {
            System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
            number = sc.nextInt();
        }
        System.out.println("Le nombre saisi est : " + number);
    }
}

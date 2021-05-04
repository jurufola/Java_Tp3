package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
        number = sc.nextInt();
        while (number<=1 || number >= 10) {
            System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
            number = sc.nextInt();
        }
        System.out.println("Table de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}

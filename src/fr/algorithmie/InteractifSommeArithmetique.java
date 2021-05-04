package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre positif ");
        number = sc.nextInt();
        while (number<=0) {
            System.out.println("Le nombre doit être strictement positif");
            number = sc.nextInt();
        }
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("La somme de tous les entiers compris entre 1 et " + number + " est " + sum);
    }
}

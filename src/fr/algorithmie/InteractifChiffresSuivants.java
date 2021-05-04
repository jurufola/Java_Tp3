package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print((number+i) + ", ");
        }
    }
}

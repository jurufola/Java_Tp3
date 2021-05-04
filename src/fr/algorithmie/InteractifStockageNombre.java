package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int option, number;
        int[] array = new int[1];// On part avec un tableau de 1 élément
        Scanner sc = new Scanner(System.in);
        displayMenu();
        boolean next = true;
        while(next){
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Veuillez saisir un nombre à rajouter au tableau");
                    number = sc.nextInt();
                    array = addToArray(array, number);
                    displayMenu();

                    break;
                case 2:
                    displayArray(array);
                    displayMenu();
                    break;
                default:
                    System.out.println("Au revoir");
                    next = false;
            }
        }

    }
    /**
     *  Affiche le Menu
     */
    public static void displayMenu() {
        System.out.println("**********Menu**********");
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
    }

    /**
     *  Affiche le contenu du tableau
     */
    public static void displayArray(int[] array){
        System.out.println("Affichage contenu tabeau");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    /**
     *  Ajoute un élement au tableau
     */
    public static int[] addToArray(int[] array, int number) {

        // creation nouveau tableau de dimension n + 1 lorsque le tableau a plus d'un élement
        int[] newArray = new int[array.length + 1];
        // Copie du contenu du tableau inital
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
            newArray[array.length] = number;
        //}
        return newArray;
    }
}

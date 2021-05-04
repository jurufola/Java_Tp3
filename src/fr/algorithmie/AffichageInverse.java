package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
       /* Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • Afficher l’ensemble des éléments du tableau grâce à une boucle
        • Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        • Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy*/

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Le tableau contient les élements suivants :");
        for (int value : array) {
            System.out.println(value);
        }

        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Le tableau contient les élements suivants dans l'ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy a)
       // int[] arrayCopy = array;
        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy b)
        int[] arrayCopy = new int[array.length];
        System.out.println("Mon second tableau contient : ");
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
            System.out.println("arrayCopy[" + i + "] = " + arrayCopy[i]);
        }
    }
}

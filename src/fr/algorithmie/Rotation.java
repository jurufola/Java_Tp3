package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        int nbElements = array.length;
        int rot = array[nbElements -1]; // On garde le dernier élément de coté
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1]; // on parcours le tableau dans le sens inverse en permuttant l'element courant avec son précedent
        }
        array[0]= rot; // a ce stage tous les élements ont eu leur position avancée de un sauf le dernier élement

        //Affichage nouveau tableau
        System.out.println("Le nouveau tableau contient : ");
        for (int value : array) {
            System.out.println(value);
        }

    }
}

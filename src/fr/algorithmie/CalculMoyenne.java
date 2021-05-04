package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int sum = 0;
        double average = 0.0;
        for (int value : array) {
            sum+= value;
        }
        average = (double)sum/array.length;
        System.out.println("La moyenne des éléments du tableau est : " + average);
    }
}

package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18} ;
        int[] arraySumDiff = new int[array1.length>=array2.length ? array1.length : array2.length];
        // J'ai choisi de prendre un tableau de taille égale a celle du plus grand des 2 tableaux
        System.out.println("La somme des deux tableaux : ");
        for (int i = 0; i < Math.max(array1.length,array2.length); i++) {
            if(i<Math.min(array1.length,array2.length)){
                arraySumDiff[i] = array1[i] + array2[i];
            }else {
                arraySumDiff[i] = array1.length>=array2.length ? array1[i] : array2[i];
            }
            System.out.println("arraySumDiff[" + i + "] = " + arraySumDiff[i]);
        }
    }
}

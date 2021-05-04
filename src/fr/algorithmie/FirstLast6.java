package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8 ,10, 0};
        /* 1 ere possiblilité
        boolean myBolean = false;
            if (array.length>=1 && ((array[0]==6) || array[array.length-1]==6)){
            myBolean = true;
        }*/
        // 2nde possiblilité
        boolean myBoolean = (array.length>=1 && ((array[0]==6) || array[array.length-1]==6)) ? true : false;
        System.out.println(" Ma variable booléenne vaut : " + myBoolean);
    }
}

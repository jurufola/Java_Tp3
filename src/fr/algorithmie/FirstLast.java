package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {0};
        boolean myBoolean = (array.length>=1 && (array[0]==array[array.length-1])) ? true : false;
        System.out.println(" Ma variable booléenne vaut : " + myBoolean);
    }
}

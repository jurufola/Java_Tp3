package fr.declaration.variable;

import java.util.Scanner;

public class DeclarationApp {
    public static void main(String[] args) {
        byte myByte = 2;
        short myShort = 600;
        int myInt = 12358;
        long myLong = 25879634;
        float myfloat = 1.5f;
        double myDouble = 52.36d;
        char myChar ='a';
        boolean myBoolean = true;
        String myString = "Moulaye";
        String randomString = "Voici le résultat d’un calcul : 1+5=6";
        System.out.println(randomString);
        Scanner s = new Scanner(System.in);
       /* short age;
        double argent;
        System.out.println("Merci de saisir votre age :");
        age =s.nextShort();
        System.out.println("Merci de saisir le montant de votre argent : ");
        argent =s.nextDouble();
        if (age>18 && argent==1000) {
            System.out.println("L'utilisateur a plus 18 ans et a 1000 euros");
        }
        if (age>21 || argent>1000) {
            System.out.println("L' utilisateur a plus de 21 ans ou qu'il a plus de 1000 euros");
        }
        if (age>15 && argent!=1000) {
            System.out.println("L'utilisateur a plus de 15 ans et qu'il n'a pas exactement 1000 euros");
        }*/
        // créer 2 tableaux :
        // un tableau qui contient des String (produits)
        // un tableau qui contient des prix (à virgule)
        // les tableaux doivent avoir la même taille
        // parcourir les deux tableaux en même temps afin d'afficher
        // le produit et son prix
        /*String[] produit = {"apple", "banana", "anana", "strawberry"};
        double[] prix = { 4.0, 2.5, 10.0, 4.2 };

        for (int i = 0; i < produit.length; i++) {
            System.out.println("mon fruit " + produit[i] + " a comme prix " + prix[i]);
        }*/
        // demander à l'utilisateur un nombre
        // en fonction du nombre (supposons 4), afficher :
        // une ligne d'étoiles :
        // ****
        // un carre d'étoiles :
        // ****
        // ****
        // ****
        // ****
        // un triangle d'étoiles
        // *
        // **
        // ***
        // ****

        System.out.println("Saisissez un nombre d'étoiles");
        int nbEtoiles = s.nextInt();
        // une ligne d'étoiles :
        System.out.println("une ligne d'étoiles");
        for (int i = 0; i < nbEtoiles; i++) {
            System.out.print("*");
        }
        System.out.println();
        //un carré d'étoiles
        System.out.println("un carré d'étoiles");
        for (int i = 0; i < nbEtoiles; i++) {
            for (int j = 0; j < nbEtoiles; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //un triangle d'étoiles
        System.out.println("un triangle d'étoiles");
        for (int i = 0; i < nbEtoiles; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

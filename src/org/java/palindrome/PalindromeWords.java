package org.java.palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        /*scrivere un programma che chiede all’utente di inserire una parola
        e gli risponde se è una parola palindroma oppure no*/
        Scanner scan = new Scanner(System.in);

        // definisco la variabile parola scelta dall'utente
        System.out.print("Inserisci una parola: ");
        String userWord = scan.nextLine();

        //creo un array con i caratteri della parola dell'utente
        char [] userWordArray = userWord.toCharArray();
        System.out.println(userWordArray);

        //creo un array vuoto dove inserisco i caratteri della parola in ordine inverso
        char [] reverseArray = new char[userWord.length()];

        boolean isPalindrome = false;

        for (int i=userWordArray.length-1; i>=0; i--){
            reverseArray = new char[]{userWordArray[i]};
            System.out.println(Arrays.toString(reverseArray));
        }
        System.out.println(Arrays.toString(reverseArray));

       /*
        if(!isPalindrome) {
            System.out.println(reverseArray);
            System.out.println("La parola inserita è palindroma.");
        } else {
            System.out.println("La parola inserita non è palindroma.");
        }*/





    }

}

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
        //char [] reverseArray = new char[userWord.length()];

        boolean isPalindrome = true;

        for (int i=0; i<userWordArray.length; i++){
           if (userWordArray[i] != userWordArray[userWordArray.length-i-1]){
               isPalindrome=false;
           }
        }
        System.out.println(Arrays.toString(userWordArray));
        System.out.println(isPalindrome);

        }

    }



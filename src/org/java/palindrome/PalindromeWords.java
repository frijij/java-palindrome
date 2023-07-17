package org.java.palindrome;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        /*scrivere un programma che chiede all’utente di inserire una parola
        e gli risponde se è una parola palindroma oppure no*/
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String userWord = scan.nextLine();
        System.out.println(userWord);


    }

}

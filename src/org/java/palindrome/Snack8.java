package org.java.palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        /* bonus 1 : Chiedi un numero di 4 cifre
        all’utente e calcola la somma di tutte le cifre che compongono il numero.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserici un numero di 4 cifre: ");
        int choosenNumber = scan.nextInt();

        String[] digits = String.valueOf(choosenNumber).split("");
        System.out.println(Arrays.toString(digits));

        int sum =0;
        for (int i=0; i< digits.length; i++) {
            sum+= Integer.parseInt(digits[i]);
        }

System.out.print(sum);

        scan.close();
    }
}

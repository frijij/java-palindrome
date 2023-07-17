package org.java.palindrome;

import java.util.Arrays;
import java.util.Random;

public class Snack9 {
    public static void main(String[] args) {
// Calcola la somma e la media dei primi 10 numeri.

        Random randomGenerator = new Random();
        int [] numbersArray = new int[10];
int sum = 0;
        for (int i=0; i<numbersArray.length; i++){
            int numRandom = randomGenerator.nextInt(1, 101);
            numbersArray[i] = numRandom;
           sum += numbersArray[i];
        }

        System.out.println("L'array contiene i seguenti numeri: " + Arrays.toString(numbersArray));
        System.out.println("La somma dei numeri è: " + sum);
        double numbersMean = sum / numbersArray.length;
        System.out.println("La media è: " + numbersMean);
    }
}

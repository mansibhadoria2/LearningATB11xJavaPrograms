package ex_08_While;

import java.util.Random;
import java.util.Scanner;

public class Lab04_While_Guess_RandomNumber {
    public static void main(String[] args) {
        // Guess a number between 1 to 15


        Random random = new Random();
        int numberToGuess = random.nextInt(15)+1;
        System.out.println(numberToGuess);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess any random number between 1 to 15");



    }
}

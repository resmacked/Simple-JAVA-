package com.resmacked;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;

    do {
        System.out.println("Guess the Number between 1 to 100: \uD83D\uDE0E ");
        userNumber = sc.nextInt();
        if (myNumber == userNumber) {
            System.out.println("WOOHOO! You Guessed the Number!");
            break;
        }
        else if (myNumber > userNumber){
            System.out.println("your Number is too small");
        }
        else {
            System.out.println("your number is too large");
        }

    }while (userNumber >= 0);

    System.out.println("The Number was:");
    System.out.println(myNumber);
        System.out.println("Thanks for playing! \uD83D\uDE42");

    }
}

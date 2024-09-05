package ExercisesAndProblems.Problems.IntroductionToJava;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int P  = input.nextInt();
        System.out.print("Enter time: ");
        int T = input.nextInt();
        System.out.print("Enter interest rate: ");
        int R = input.nextInt();

        int interest = P * R / T;
        System.out.println("Interest rate: " + interest);
    }
}

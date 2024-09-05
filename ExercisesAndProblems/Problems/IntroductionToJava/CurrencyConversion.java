package ExercisesAndProblems.Problems.IntroductionToJava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nepali rupees: ");
        int nrp = input.nextInt();

        float dollar = (nrp * 134.43f);

        System.out.println("The nepali rupee is " + dollar + " dollars");
    }
}

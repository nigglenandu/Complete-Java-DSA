// Write a program to print whether a number is even or odd, also take input from the user.
package ExercisesAndProblems.Problems.IntroductionToJava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is even");
        } else{
            System.out.println(number + " is odd");
        }
    }
}

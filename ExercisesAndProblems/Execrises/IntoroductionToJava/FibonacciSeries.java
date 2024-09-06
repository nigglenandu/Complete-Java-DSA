package ExercisesAndProblems.Execrises.IntoroductionToJava;

//To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter nth term: ");
        int n = input.nextInt();
        System.out.print(a + " " + b);
        for(int i = 3 ; i<=n; i++ ){
            int c = a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}

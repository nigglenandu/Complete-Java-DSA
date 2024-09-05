package ExercisesAndProblems.Problems.IntroductionToJava;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Enter operator (+, -,  *, /) :  ");
        char operator = input.next().charAt(0);

        int result;

        if(operator == '+'){
            result = num1 + num2;
            System.out.println("The Sum of num1 and num2 is " + result);
        } else if (operator == '-'){
            result = num1 - num2;
            System.out.println("The Difference of num1 and num2 is " + result);
        } else if (operator == '*'){
            result = num1 * num2;
            System.out.println("The Product of num1 and num2 is: " + result);
        } else if (operator == '/'){
            if(num2 != 0){
                result = num1 / num2;
                System.out.println("The Division of num1 and num2 is " + result);
            } else {
                System.out.println("Division by zero is not allowed");
            }
        } else {
            System.out.println("Invalid operator");
        }

    }
}

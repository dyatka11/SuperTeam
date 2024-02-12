package Mohammed;

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
       // int number = 5;
        long factorial = 1;

        if (number < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        for (int i = 1; i <= number; i++) {

            factorial *= i;

        }

        System.out.println("The factorial of " + number + " is: " + factorial);







    }
    /*
     Task 1: Write a Java method to calculate the factorial of a given number.
A factorial of a non-negative integer n is the product of all positive integers less than or
equal to n. It's denoted by n!.
 For example, the factorial of 5 (5!) is 5 x 4 x 3 x 2 x 1 = 120.

Requirements:

The method should take an integer as input and return its factorial.
Consider edge cases, such as the factorial of 0.
Handle any potential exceptions or errors gracefully.
     */
}

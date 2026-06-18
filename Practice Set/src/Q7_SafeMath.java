//Pratyush Bidari
//116238

import java.util.Scanner;
import java.util.InputMismatchException;

public class Q7_SafeMath {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            //Taking input for number a
            System.out.println("Enter first number (a): ");
            int a = input.nextInt();

            //Taking input for number b
            System.out.println("Enter second number (b): ");
            int b = input.nextInt();

            int res = a / b;
            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e) {
            //Catches the division by zero error
            System.out.println("Error: It cannot be divided by zero!");
        }
        catch (InputMismatchException e) {
            //Catches errors when a letter is typed instead of a number
            System.out.println("Error: Only integers and no letters!");
        }
    }
}

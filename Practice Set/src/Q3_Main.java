//Pratyush Bidari
//116238

import java.util.Scanner;
public class Q3_Main {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

        //Try-catch block in the main class
        try {
            //calling the check method
            Q3_AgeProtector.check(age);
        }
        catch  (Q3_InvalidAgeException e) {
            //Printing a custom error message
            System.out.println("Age is invalid!");
        }
    }
}

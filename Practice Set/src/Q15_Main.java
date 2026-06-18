//Pratyush Bidari
//116238

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Q15_Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Q15_Employee> staff = new ArrayList<>();

        // Adding both full-time workers and contractors to the same list
        staff.add(new Q15_FullTime("Anil Dhungana", 5000.00));
        staff.add(new Q15_Contractor("Surat Bista", 45.00, 40));
        staff.add(new Q15_FullTime("Saurav Shah", 6200.00));

        // Try to create and write to the report file
        try {
            PrintWriter writer = new PrintWriter("payroll_report.txt");

            // Writing the header text
            writer.println("---- EMPLOYEE PAYROLL REPORT ----");

            // Using Loop through every employee
            for (Q15_Employee emp : staff) {
                double pay = emp.calculatePay();
                writer.println("Name: " + emp.name + " | Pay: $" + pay); // Write employee data
            }
            writer.close(); // Save and close the file
            System.out.println("Report successfully exported to 'payroll_report.txt'!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not create the report file.");
        }
    }
}

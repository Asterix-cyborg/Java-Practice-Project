//Pratyush Bidari
//116238

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q4_DailySalesLog {
    public static void main(String[] args) {

        //Creating an array with 7 days of sales numbers
        double[] sales = {150.50, 220.00, 85.75, 400.20, 310.00, 180.45, 95.10};

        try (PrintWriter pw = new PrintWriter("weekly_sales.txt")) {
            for (double s : sales) {
                pw.println(s);
            }
            System.out.println("Data saved successfully.");
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}

//Pratyush Bidari
//116238

public class Q15_FullTime extends Q15_Employee {
    double monthlySalary;

    // Constructor to set name and salary
    public Q15_FullTime(String name, double monthlySalary) {
        super(name); // Sends the name to the parent Employee class
        this.monthlySalary = monthlySalary;
    }
    // Calculates pay
    @Override
    double calculatePay() {
        return monthlySalary;
    }
}
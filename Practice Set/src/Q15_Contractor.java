//Pratyush Bidari
//116238

public class Q15_Contractor extends Q15_Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor to set name, rate, and hours
    public Q15_Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name); // Sends the name to the parent Employee class
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

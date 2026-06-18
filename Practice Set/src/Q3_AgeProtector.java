//Pratyush Bidari
//116238

public class Q3_AgeProtector {

    //Method to check the age rule
    static void check (int age) throws Q3_InvalidAgeException {
        if (age < 18) {
            //Throwing the new custom exception if under 18
            throw new Q3_InvalidAgeException();
        }
        System.out.println("Age is valid!");
    }
}

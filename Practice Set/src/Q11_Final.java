//Pratyush Bidari
//116238

import java.util.ArrayList;

public class Q11_Final {
    static void main(String[] args) {

        //Creating a array list
        ArrayList<Q11_Vehicle> fleet = new ArrayList<>();

        //adding vehicles into the fleet list
        fleet.add(new Q11_Bike());
        fleet.add(new Q11_Bus());
        fleet.add(new Q11_Bike());

        //Loop through each vehicle inside the fleet list
        for (Q11_Vehicle v : fleet) {
            System.out.println(v.calculateFee());
        }
    }
}

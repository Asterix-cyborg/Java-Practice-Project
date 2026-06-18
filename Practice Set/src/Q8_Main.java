//Pratyush Bidari
//116238

public class Q8_Main {
    static void main(String[] args) {

        //Creating array of Electronics
        Q8_Electronics [] inventory = {new Q8_Electronics(100.0), new Q8_Electronics(500.0)};

        //Loop to apply discount
        for (Q8_Electronics e : inventory) {
            e.applyDiscount(10.0);
        }
    }
}

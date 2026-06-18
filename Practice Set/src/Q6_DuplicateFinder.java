//Pratyush Bidari
//116238

import java.util.ArrayList;
public class Q6_DuplicateFinder {
    static void main(String[] args) {

        //Creating an ArrayList
        ArrayList<String> guests = new ArrayList<>();

        //Adding names to the guest list including duplicates
        guests.add("Anil");
        guests.add("Saurav");
        guests.add("Anil");
        guests.add("Nihal");
        guests.add("Saurav");

        //Using loop to find and print duplicates
        for (int i = 0; i < guests.size(); i++) {
            for (int j = i + 1; j < guests.size(); j++) {

                //Checking if the name at index i matches the name at index j
                if (guests.get(i).equals(guests.get(j))) {
                    System.out.println("Duplicate found: " + guests.get(i));
                }
            }
        }
    }
}

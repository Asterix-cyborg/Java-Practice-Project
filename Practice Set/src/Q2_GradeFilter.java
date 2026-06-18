//Pratyush Bidari
//116238

import java.util.ArrayList;

public class Q2_GradeFilter {
    static void main(String[] args) {

        //Creating an array list
        ArrayList<Integer> scores = new ArrayList<>();

        //Adding scores to the list
        scores.add (95);
        scores.add (87);
        scores.add (38);
        scores.add (72);

        //Using a loop to condition the scores
        for (int score : scores) {
            if (score >= 90) {
                System.out.println("Distinction.");
            }
            if (score >= 40) {
                System.out.println("Pass.");
            } else {
                System.out.println("Fail.");
            }
        }
    }
}

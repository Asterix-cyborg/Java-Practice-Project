//Pratyush Bidari
//116238

public class Q13_Final {
    static void main(String[] args) {

        //Creating library objects
        Q13_Searchable dB = new Q13_EBook("Java Programming");
        Q13_Searchable pB = new Q13_PhysicalBook("Introduction to Religion");

        //Executing search function on objects
        dB.search("Java");
        pB.search("History");
    }
}

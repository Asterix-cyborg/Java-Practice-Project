//Pratyush Bidari
//116238

public class Q1_ColdBox extends Q1_StorageUnit implements Q1_Refrigerated {

    //Constructor
    public Q1_ColdBox(int id, double capacity) {
        super (id, capacity);
    }
    //Implementing interface
    public void adjustTemp (int t) {
        System.out.println("Temperature adjusted to: " + t + " degrees.");
    }
}


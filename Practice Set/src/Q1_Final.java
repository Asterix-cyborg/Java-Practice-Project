//Pratyush Bidari
//116238

public class Q1_Final {
    static void main(String[] args) {

        //Creating objects
        Q1_ColdBox cb1 = new Q1_ColdBox(101, 1000);

        //Printing the output
        System.out.println("Storage Unit ID: " + cb1.id);
        System.out.println("Storage Unit Capacity: " + cb1.capacity);

        //Calling method of refrigerated at last to keep it at the end
        cb1.adjustTemp(7);
    }
}


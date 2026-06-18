//Pratyush Bidari
//116238

public class Q5_Main {
    static void main(String[] args) {

        //Creating an array of electronic devices
        Q5_ElectronicDevice[] devices = {new Q5_Printer(), new Q5_Scanner()};

        //Using a loop through each device
        for (Q5_ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}

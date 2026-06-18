//Pratyush Bidari
//116238

public class Q8_Electronics implements Q8_Discountable{
    double price;

    //Creating a constructor
    public Q8_Electronics (double price) {
        this.price = price;
    }

    //implementing the abstract interface
    public void applyDiscount (double pct) {
        price = price - (price * (pct / 100.0));
        System.out.println("\nNew price after discount: $" + price);
    }
}

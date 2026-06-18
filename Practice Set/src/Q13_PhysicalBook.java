//Pratyush Bidari
//116238

public class Q13_PhysicalBook implements Q13_Searchable {
    private String title;

    //Using a constructor
    public Q13_PhysicalBook(String title) {
        this.title = title;
    }
    //A custom search logic for physical book
        public void search(String k) {
        System.out.println("Searching the physical book " + title + " for " + k);
    }
}

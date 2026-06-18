//Pratyush Bidari
//116238

public class Q13_EBook implements Q13_Searchable {
    private String title;

    //Using a constructor
    public Q13_EBook(String title) {
        this.title = title;
    }

    //A custom search logic for ebook
    public void search (String k) {
        System.out.println("Searching the book " + title + " for " + k);
    }
}


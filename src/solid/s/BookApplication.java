package solid.s;

public class BookApplication {
    public static void main(String[] args) {
        Book conjuring =
                new Book("Conjuring",
                        "Author",
                        "A horror book");

        FilterBooks bookFilter = new FilterBooks();
        if( bookFilter.checkBookGenres(conjuring,"horror")){
            System.out.println("conjuring is horror book");
        }

    }
}

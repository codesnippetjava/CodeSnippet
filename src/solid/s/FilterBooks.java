package solid.s;

public class FilterBooks {

    public Boolean checkBookGenres(Book book,String genre){
       return book.isWordInText(genre);
    }

    public Book FilterBookByGenres(String genre){
        //filter books according to genre
        return new Book(null,null,null);
    }


}

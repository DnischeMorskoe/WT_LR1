package bsuir.tozik.lab1.task15;
import bsuir.tozik.lab1.task12.Book;
import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book>{
    @Override
    public int compare(Book book1, Book book2) {
        int result = book1.getTitle().compareTo(book2.getTitle());
        if (result == 0) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
        return result;
    }
}

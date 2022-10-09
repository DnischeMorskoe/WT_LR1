package bsuir.tozik.lab1.task15;
import bsuir.tozik.lab1.task12.Book;
import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
@Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}

package bsuir.tozik.lab1.task15;
import bsuir.tozik.lab1.task12.Book;
import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        int titleComparison;
        if (authorComparison == 0) {
            titleComparison = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparison == 0) {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
            return titleComparison;
        }
        return authorComparison;
    }
}

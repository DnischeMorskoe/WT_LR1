package bsuir.tozik.lab1.task12;

public class Book  implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;


    public String toString() {
        return "Title: " + title + "; Author: " + author + "; Price: " + price;
    }

    public int getEdition() {
        return edition;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (this == object) {
            return true;
        } else if (getClass() != object.getClass()) {
            return false;
        }

        Book book = (Book) object;
        return (!title.equals(book.title) || !author.equals(book.author) || price != book.getPrice() || edition != book.getEdition());
    }

    public int hashCode() {
        final int prime = 16;
        int result = 1;

        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + author.hashCode();
        result = prime * result + title.hashCode();

        return result;
    }

    protected Object clone() throws CloneNotSupportedException {
        Book book = new Book();
        book.price = this.price;
        book.author = this.author;
        book.title = this.title;
        return book;
    }

    public int compareTo(Book book) {
        String firstIsbn = book.isbn;
        String secondIsbn = this.isbn;

        firstIsbn = firstIsbn.replaceAll("-", "");
        secondIsbn = secondIsbn.replaceAll("-", "");

        //  return new BigInteger(firstIsbn).compareTo(new BigInteger(secondIsbn));
        return firstIsbn.compareTo(secondIsbn);
    }

}

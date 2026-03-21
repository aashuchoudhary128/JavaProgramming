import java.util.ArrayList;
import java.util.Iterator;
class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}
class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }
    public void removeBookByISBN(String isbn) {
        Iterator<Book> iterator = books.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                found = true;
                System.out.println("Book removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Library Books:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java Basics", "John Doe", "111"));
        library.addBook(new Book("OOP Concepts", "Jane Smith", "222"));
        library.displayBooks();
        library.removeBookByISBN("111");
        library.displayBooks();
    }
}

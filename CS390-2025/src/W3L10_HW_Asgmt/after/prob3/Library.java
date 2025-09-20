package W3L10_HW_Asgmt.after.prob3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Library {
    private final HashMap<String, Book> map = new HashMap<>();

    public void addBook(String ISBN, String title, String author) {
        if (map.containsKey(ISBN)) {
            System.out.println("Key already exists in the library.");
            return;
        }
        map.put(ISBN, new Book(ISBN, title, author));
        System.out.println("Book successfully added.");
    }

    public void borrowBook(String ISBN) {
        Book book = map.get(ISBN);

        if (book == null) {
            throw new NoSuchElementException("Book not found");
        }

        if (book.isBorrowed()) {
            System.out.println("Sorry this book is already borrowed.");
            return;
        }
        book.setBorrowed(true);
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(String ISBN) {
        Book book = map.get(ISBN);

        if (book == null) {
            throw new NoSuchElementException("Book not found");
        }

        if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("Book returned successfully.");
            return;
        }
        System.out.println("This book was not borrowed, cannot return");
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = map.get(ISBN);
        return book.isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        return map.get(ISBN);
    }

    public void listAllBooks() {
        for (Book book : map.values()) {
            if (book != null)
                System.out.println(book);
        }
    }

    public void listBorrowedBooks() {
        for (Book book : map.values()) {
            if (book.isBorrowed()) {
                System.out.println("Borrowed book -> " + book);
            }
        }
    }

}

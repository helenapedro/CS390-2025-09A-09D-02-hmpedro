package W3L10_HW_Asgmt.after.prob3;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> map = new HashMap<>();

    public void addBook(String ISBN, String title, String author) {
        if (ISBN == null || ISBN.isBlank()) {
            System.out.println("Invalid ISBN.");
            return;
        }

        if (map.containsKey(ISBN)) {
            System.out.println("Key already exists in the library.");
            return;
        }
        map.put(ISBN, new Book(ISBN, title, author));
        System.out.println("Book successfully added.");
    }

    public boolean borrowBook(String ISBN) {
        if (ISBN == null || ISBN.isBlank()) {
            System.out.println("Invalid ISBN.");
            return false;
        }

        Book book = getBook(ISBN);

        if (isBookNull(book)) return false;

        if (book.isBorrowed()) {
            System.out.println("Sorry this book is already borrowed.");
            return false;
        }

        book.setBorrowed(true);
        System.out.println("Book borrowed successfully.");
        return true;
    }

    public boolean returnBook(String ISBN) {
        if (ISBN == null || ISBN.isBlank()) {
            System.out.println("Invalid ISBN.");
            return false;
        }

        Book book = getBook(ISBN);

        if (isBookNull(book)) return false;

        if (!book.isBorrowed()) {
            System.out.println("This book was not borrowed, cannot return");
            return false;
        }

        book.setBorrowed(false);
        System.out.println("Book returned successfully.");
        return true;
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = getBook(ISBN);
        if (isBookNull(book)) return false;
        return book.isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        return map.get(ISBN);
    }

    public void listAllBooks() {
        for (Book book : map.values()) {
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

    // Helper Methods
    private static boolean isBookNull(Book book) {
        if (book == null) {
            System.out.println("Book not found");
            return true;
        }
        return false;
    }

    private Book getBook(String ISBN) {
        return map.get(ISBN);
    }
}

package W3L10_HW_Asgmt.after.prob3;

class Book {
    private final String ISBN;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book{ISBN = " + ISBN + ", title = " + title
                + ", author = " + author + ", isBorrowed = " + isBorrowed + "}";
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}


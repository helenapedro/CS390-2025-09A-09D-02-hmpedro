package W3L10_HW_Asgmt.after.prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("Volume I", "System Design Interview", "Alex Xu");
        lb.addBook("Volume II", "System Design Interview", "Alex Xu");
        lb.addBook("Volume III", "System Design Interview", "Alex Xu");
        lb.addBook("Volume IIII", "System Design Interview", "Alex Xu");
        System.out.println();

        System.out.println();
        lb.borrowBook("Volume I");
        lb.borrowBook("Volume III");
        lb.returnBook("Volume I");
        lb.returnBook("Volume IIII");
        lb.listAllBooks();

        boolean isBorrowed = lb.isBookBorrowed("Volume I");
        System.out.println(isBorrowed);

        System.out.println(lb.getBookDetails("Volume I"));

        lb.listBorrowedBooks();
    }
}

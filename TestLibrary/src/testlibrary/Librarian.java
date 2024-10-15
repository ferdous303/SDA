package testlibrary;

import java.util.ArrayList;

// Librarian class
public class Librarian {
    private String libraryName;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Librarian() {
        System.out.println("Librarian is created");
    }

    public Librarian(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Librarian is created for the library: " + libraryName);
    }

    // Method to add a new book
    public void addBook(Book book) {
        if (!bookExists(book.getBookId())) {
            books.add(book);
            System.out.println("Book is added successfully");
        } else {
            System.out.println("Book is already in the library");
        }
    }

    // Method to remove a book
    public void removeBook(int bookId) {
        if (removeBookById(bookId)) {
            System.out.println("Book ID " + bookId + " is removed from the library");
        } else {
            System.out.println("Book ID " + bookId + " is not present in the library");
        }
    }

    // Method to add a new member
    public void addMember(Member member) {
        if (!memberExists(member.getMemberId())) {
            members.add(member);
            System.out.println("Member is added successfully");
        } else {
            System.out.println("Member is already registered");
        }
    }

    // Method to remove a member
    public void removeMember(int memberId) {
        if (removeMemberById(memberId)) {
            System.out.println("Member ID " + memberId + " is removed from the library");
        } else {
            System.out.println("Member ID " + memberId + " is not present in the library");
        }
    }

    // Method to show all registered members
    public void showRegisteredMembers() {
        System.out.println("Library Name: " + libraryName);
        int i = 1;
        for (Member member : members) {
            System.out.print(i + ". ");
            member.showMemberDetails();
            i++;
        }
    }

    // Method to show all books in the library
    public void showAllBooks() {
        System.out.println("Library Name: " + libraryName);
        int i = 1;
        for (Book book : books) {
            System.out.println(i + ". " + book);
            i++;
        }
    }

    // Method to search for books
    public String searchBook(String keyword) {
        StringBuilder results = new StringBuilder("Search Results for: " + keyword + "\n");
        boolean found = false;

        // GRASP: Information Expert
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                // High Cohesion
                results.append(book).append("\n");
                found = true;
            }
        }
        if (!found) {
            // Low Coupling
            results.append("No books found with the keyword: ").append(keyword);
        }

        return results.toString();
    }

    // Method to borrow a book
    public String borrowBook(int bookId, int memberId) {
        Book bookToBorrow = findAvailableBook(bookId);
        Member member = findMember(memberId);

        // Protected Variations
        if (bookToBorrow != null && member != null) {
            bookToBorrow.setBorrowed(true);
            return "Book ID " + bookId + " is borrowed by Member ID " + memberId;
        } else if (bookToBorrow == null) {
            return "Book ID " + bookId + " is not available for borrowing";
        } else {
            return "Member ID " + memberId + " is not registered";
        }
    }

    // Method to return a book
public String returnBook(int bookId) {
    // Reduce code repetition
    // Reusing the findBorrowedBook method to encapsulate the logic of finding the borrowed book.
    Book bookToReturn = findBorrowedBook(bookId);

    // GRASP: Information Expert
    // The Librarian class has the necessary information to manage book borrowing and returning
    if (bookToReturn != null) {
        bookToReturn.setBorrowed(false);
        return "Book ID " + bookId + " is returned to the library";
    } else {
        // Low Coupling
        // The method does not depend on other components or state, making it less vulnerable to changes
        return "Book ID " + bookId + " was not borrowed or does not exist";
    }
}


    // Helper methods to reduce code repetition
    private boolean bookExists(int bookId) {
        return books.stream().anyMatch(book -> book.getBookId() == bookId);
    }

    private boolean memberExists(int memberId) {
        return members.stream().anyMatch(member -> member.getMemberId() == memberId);
    }

    private boolean removeBookById(int bookId) {
        return books.removeIf(book -> book.getBookId() == bookId);
    }

    private boolean removeMemberById(int memberId) {
        return members.removeIf(member -> member.getMemberId() == memberId);
    }

    private Book findAvailableBook(int bookId) {
        return books.stream()
                .filter(book -> book.getBookId() == bookId && !book.isBorrowed())
                .findFirst()
                .orElse(null);
    }

    private Book findBorrowedBook(int bookId) {
        return books.stream()
                .filter(book -> book.getBookId() == bookId && book.isBorrowed())
                .findFirst()
                .orElse(null);
    }

    private Member findMember(int memberId) {
        return members.stream()
                .filter(member -> member.getMemberId() == memberId)
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

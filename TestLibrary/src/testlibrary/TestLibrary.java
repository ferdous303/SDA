package testlibrary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestLibrary {
    public static void main(String[] args) {
        // Create the librarian instance and pre-load 30 books
        Librarian librarian = new Librarian("Central Library");
        for (int i = 1; i <= 30; i++) {
            librarian.addBook(new Book(i, "Book Title " + i, "Author " + (i % 10)));
        }

        // Pre-loading 10 members into the library
        for (int i = 1; i <= 10; i++) {
            librarian.addMember(new Member(i, "Member " + i));
        }

        // Create the main frame
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());

        // Text area to display results
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Panel for inputs and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Borrow book panel
        JPanel borrowBookPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField borrowBookIdField = new JTextField(5);
        JTextField borrowMemberIdField = new JTextField(5);
        JButton borrowBookButton = new JButton("Borrow Book");
        borrowBookPanel.add(new JLabel("Book ID:"));
        borrowBookPanel.add(borrowBookIdField);
        borrowBookPanel.add(new JLabel("Member ID:"));
        borrowBookPanel.add(borrowMemberIdField);
        borrowBookPanel.add(borrowBookButton);
        panel.add(borrowBookPanel);

        // Return book panel
        JPanel returnBookPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField returnBookIdField = new JTextField(5);
        JButton returnBookButton = new JButton("Return Book");
        returnBookPanel.add(new JLabel("Book ID:"));
        returnBookPanel.add(returnBookIdField);
        returnBookPanel.add(returnBookButton);
        panel.add(returnBookPanel);

        // Search book panel
        JPanel searchBookPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField searchBookField = new JTextField(15);
        JButton searchBookButton = new JButton("Search Book");
        searchBookPanel.add(new JLabel("Search Book:"));
        searchBookPanel.add(searchBookField);
        searchBookPanel.add(searchBookButton);
        panel.add(searchBookPanel);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.NORTH);

        // Add action listeners
        searchBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = searchBookField.getText();
                resultArea.setText("Search Results for: " + keyword + "\n");
                boolean found = false;
                for (Book book : librarian.getBooks()) {
                    if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                        resultArea.append(book.toString() + "\n");
                        found = true;
                    }
                }
                if (!found) {
                    resultArea.append("No books found with the keyword: " + keyword + "\n");
                }
            }
        });

        borrowBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int bookId = Integer.parseInt(borrowBookIdField.getText());
                    int memberId = Integer.parseInt(borrowMemberIdField.getText());
                   
                    resultArea.setText( librarian.borrowBook(bookId, memberId));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid Book ID or Member ID\n");
                }
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int bookId = Integer.parseInt(returnBookIdField.getText());
                   
                    resultArea.setText( librarian.returnBook(bookId));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid Book ID\n");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}

const bookModel = require('../models/bookModel');
const borrowerModel = require('../models/borrowerModel');

// Get all books
exports.getAllBooks = (req, res) => {
  const books = bookModel.getBooks();
  res.render('borrowBook', { books });
};

// Borrow a book
exports.borrowBook = (req, res) => {
  const bookId = parseInt(req.params.id);
  const book = bookModel.borrowBook(bookId);

  if (!book) {
    return res.status(404).send('Book not available or already borrowed');
  }

  // Log the borrower (for simplicity, just name here)
  borrowerModel.addBorrower({ name: req.body.name, bookId });

  res.send(`Book borrowed: ${book.title}`);
};

// Return a book
exports.returnBook = (req, res) => {
  const bookId = parseInt(req.params.id);
  const book = bookModel.returnBook(bookId);

  if (!book) {
    return res.status(404).send('Book not found or not borrowed');
  }

  res.send(`Book returned: ${book.title}`);
};

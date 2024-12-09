const books = [
    { id: 1, title: 'The Great Gatsby', available: true },
    { id: 2, title: '1984', available: true },
    { id: 3, title: 'To Kill a Mockingbird', available: false }
  ];
  
  // Get all books
  exports.getBooks = () => {
    return books;
  };
  
  // Get a specific book by ID
  exports.getBookById = (id) => {
    return books.find(book => book.id === id);
  };
  
  // Borrow a book
  exports.borrowBook = (id) => {
    const book = books.find(book => book.id === id);
    if (book && book.available) {
      book.available = false;
      return book;
    }
    return null;
  };
  
  // Return a book
  exports.returnBook = (id) => {
    const book = books.find(book => book.id === id);
    if (book && !book.available) {
      book.available = true;
      return book;
    }
    return null;
  };
  
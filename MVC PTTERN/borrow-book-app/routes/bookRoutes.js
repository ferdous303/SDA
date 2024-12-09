// bookRoutes.js
const express = require('express');
const bookController = require('../controllers/bookController');

const router = express.Router();

// Route to display all books
router.get('/', bookController.getAllBooks);

// Route to borrow a book
router.post('/borrow/:id', bookController.borrowBook);

// Route to return a book
router.post('/return/:id', bookController.returnBook);

module.exports = router;

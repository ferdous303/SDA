// In app.js
const express = require('express');
const bodyParser = require('body-parser');
const bookRoutes = require('./routes/bookRoutes');

const app = express();
app.get('/', (req, res) => {
    res.redirect('/books');  // Redirect to /books route
  });
  
// Middleware
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Set view engine (EJS)
app.set('view engine', 'ejs');

// Routes
app.use('/books', bookRoutes); // This handles the /books route

// Start server
const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});

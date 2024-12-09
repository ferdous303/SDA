const borrowers = [];

exports.addBorrower = (borrower) => {
  borrowers.push(borrower);
};

exports.getBorrowers = () => {
  return borrowers;
};

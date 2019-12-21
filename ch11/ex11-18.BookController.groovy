if(book.validate()) {
  // do something
}
else {
  book.errors.allErrors.each {
    println it
  }
}

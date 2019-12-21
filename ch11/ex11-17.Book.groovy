// 11.10 Validating Your Data

class Book {
  static constraints = {
    title(blank:false, maxSize:50)
    author(blank:false)
    cover(inList:["Hardback", "Paperback", "PDF"])
    pages(min:0, max:1500)
    category(inList:["", "Technical", "Fiction", "Non-fiction"])
    excerpt(maxSize:5000)
  }

  String title
  String author
  Integer pages
  String cover = "Paperback"
  String category
  String exceprt

  String toString(){
    "${title} by ${author}"
  }
}

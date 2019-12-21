class Podcast {
  static constraints = {
    title(blank:false)
    shortDescription(maxSize:255)
    description(maxSize:4000)
    url(blank:false)
    fileSize()
    duration()
    postedBy()
    datePosted()
  }

  String url
  String title
  String shortDescription
  String description
  Date datePosted
  Integer postedBy
  Integer fileSize
  String duration

  String toString(){
    return "$title"
  }
}

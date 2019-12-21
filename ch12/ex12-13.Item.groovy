class Item {
  static constraints = {
    title(blank:false)
    type(inList:['news', 'event', 'media'])
    shortDescription(maxSize:255)
    description(maxSize:4000)
    url(blank:false)
    postedBy()
    datePosted()
  }

  String url
  String title
  String shortDescription
  String description
  String type
  Date datePosted
  Integer postedBy

  String toString(){
    return "$type: $title"
  }
}

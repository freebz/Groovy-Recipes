// 11.12 Mapping Classes to Legacy Databases

class Magazine{
  String title
  String editorInChief

  static mapping = {
    table 'periodical'
    columns {
      id column:'periodical_id'
      title column:'publication_name'
      editorInChief column:'person_in_charge'
    }
  }
}

// Saving the Spreadsheet as an Attachment

def listExcel = {
  def list = Book.list(params)
  response.setHeader("Content-Disposition", "attachment; filename=foo.xls")
  render(contentType:"application/vnd.ms-excel") {
      ...
  }
}

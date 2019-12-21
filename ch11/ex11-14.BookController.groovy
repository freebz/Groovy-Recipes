// Render

def save = {
    def book = new Book(params)
    if(!book.hasErrors() && book.save()) {
	flash.message = "Book ${book.id} created"
	redirect(action:show,id:book.id)
    }
    else {
	render(view: 'create',model:[book:book])
    }
}

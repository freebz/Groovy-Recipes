// 8.11 Writing StreamingMarkupBuilder Output to a File

def writer = new FileWriter("person.xml")
writer << builder.bind(person)

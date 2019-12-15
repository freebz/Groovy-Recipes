// 10.7 Creating a Method Pointer

def list = []
def insert = list.&add
insert "Java"
insert "Groovy"
println list
// ===> [Java, Groovy]

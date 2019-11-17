// 3.5 Optional Datatype Declaration (Duck Typing)

//In scripts:
w = "Hello"
String x = "Hello"
println w.class
// ===> java.lang.String
println w.class == x.class
// ===> true

//In compiled classes:
def y = "Hello"
String z = "Hello"
println y.class
// ===> java.lang.String
println y.class = z.class
// ===> true


Duck mallard = new Mallard();


def d = new Duck()

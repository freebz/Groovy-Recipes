// Gotcha: Why Does .class Work on Everything Except Maps?

def family = [dad:"John", mom:"Jane"]
println family.class
// ===> null
println family.getClass()
// ===> java.util.LinkedHashMap

// Flatten

def languages = ["Java", "Groovy", "JRuby"]
def others = ["Jython", "JavaScript"]
languages << others
// ===> [Java, Groovy, JRuby, [Jython, JavaScript]]
languages = languages.flatten()
// ===> [Java, Groovy, JRuby, Jython, JavaScript]

// 3.13 GStrings

def name = "John"
println "Hello ${name}. Today is ${new Date()}"
// ===> Hello John. Today is Fri Dec 28 15:16:32 MDT 2007


println "Hello John".class
// ===> class java.lang.String

println "Hello ${name}".class
// ===> class org.codehaus.groovy.runtime.GStringImpl


def name = "John"
def date = new Date()
def amount = 987.65
def template = """
Dear ${name},
  This is a friendly notice that ${amount} was
  deposited in your checking account on ${date}.
"""

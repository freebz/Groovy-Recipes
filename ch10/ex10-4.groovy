// 10.4 Discovering the Methods of a Class

def d = new Date()
d.class.methods.each{println it}
// ===>
// ...
// public void java.util.Date.setTime(long)
// public long java.util.Date.getTime()
// public int java.util.Date.getYear()
// public int java.util.Date.getMonth()
// public int java.util.Date.getDate()
// public int java.util.Date.getHours()
// public int java.util.Date.getMinutes()
// public int java.util.Date.getSeconds()
// ...


d.class.methods.name
// ===> [getDate, setTime, getTime, from, toInstant, getYear, getMonth, getHours, getMinutes, getSeconds, UTC, setYear, setMonth, setDate, getDay, setHours, setMinutes, setSeconds, toLocaleString, toGMTString, getTimezoneOffset, equals, toString, hashCode, clone, compareTo, compareTo, parse, before, after, wait, wait, wait, getClass, notify, notifyAll]


// Dynamically Calling Methods on a Class Using Evaluate

def d = new Date()
d.class.methods.each{method ->
  if(method.name.startsWith("get")){
    print "${method.name}: "
    evaluate("dd = new Date(); println dd.${method.name}()")
  }
}
// ===>
// getTime: 1188665901916
// getYear: 107
// getMonth: 8
// getDate: 1
// getHours: 10
// getMinutes: 58
// getSeconds: 21
// getDay: 6
// getTimezoneOffset: 360
// getClass: class java.util.Date


def d = new Date()
def binding = new Binding()
binding.setVariable("d", d)
def gs = new GroovyShell(binding)

d.class.methods.each{method ->
  if(method.name.startsWith("get")){
    print "${method.name}: "
    gs.evaluate("println d.${method.name}()")
  }
}


// Dynamically Calling Methods on a Class Using a GString

def d = new Date()
d.class.methods.each{method ->
  if(method.name.startsWith("get")){
    print "${method.name}: "
    println d."${method.name}"()
  }
}


// Additional Methods of a Groovy Class

class Person{
  String firstname
  String lastname
}
def p = new Person()
p.class.methods.name
// ===> [getFirstname, setFirstname, getLastname, setLastname, __$swapInit, getMetaClass, this$dist$invoke$1, this$dist$set$1, this$dist$get$1, setMetaClass, invokeMethod, super$1$wait, super$1$wait, super$1$wait, super$1$toString, super$1$notify, super$1$notifyAll, super$1$getClass, super$1$clone, super$1$equals, super$1$hashCode, super$1$finalize, setProperty, getProperty, wait, wait, wait, equals, toString, hashCode, getClass, notify, notifyAll]

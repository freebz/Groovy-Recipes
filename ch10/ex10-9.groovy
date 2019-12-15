// 10.9 Creating an Expando

def e = new Expando()
e.class
// ===> class groovy.util.Expando
e.properties
// ===> {}
e.class.methods.name
// ===> [getMetaPropertyValues, invokeMethod, setProperty, getProperty, equals, toString, hashCode, getProperties, getMetaClass, setMetaClass, wait, wait, wait, getClass, notify, notifyAll]


e.latitude = 70
e.longitude = 30
println e
// ===> {latitude=70, longitude=30}


e.areWeLost = {->
  return (e.longitude != 30) || (e.latitude != 70)
}

e.areWeLost()
// ===> false

e.latitude = 12
e.areWeLost()
// ===> true


e.goNorth = { howMuch ->
  e.latitude += howMuch
}

println e.latitude
// ===> 12

e.goNorth(20)
// ===> 32

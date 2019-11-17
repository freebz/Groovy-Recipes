// Accepting Parameters

def hello = { println "Hi ${it}" }
hello("John")
hello "John"
// ===> Hi John


def convertToCelsius = {
  return (5.0/9.0) * (it.toFloat() - 32.0)
}

[0, 32, 70, 100].each{
  println "${it} degrees fahrenheit in celsius: ${convertToCelsius(it)}"
}
// ===>
// 0 degrees fahrenheit in celsius: -17.7777777792
// 32 degrees fahrenheit in celsius: 0.0
// 70 degrees fahrenheit in celsius: 21.1111111128
// 100 degrees fahrenheit in celsius: 37.7777777808

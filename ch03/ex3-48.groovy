// Currying Parameters

def calculateTax = { taxRate, amount ->
  return amount + (taxRate * amount)
}

def tax = calculateTax.curry(0.1)
[10,20,30].each{
  println "Total cost: ${tax(it)}"
}
// ===>
// Total cost: 11.0
// Total cost: 22.0
// Total cost: 33.0

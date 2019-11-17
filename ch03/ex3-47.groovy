// Named Parameters

def calculateTax = { taxRate, amount ->
  return amount + (taxRate * amount)
}

println "Total cost: ${calculateTax(0.055, 100)}"
// ===> Total cost: 105.500

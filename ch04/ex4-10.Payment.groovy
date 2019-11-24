// 4.6 Optional Parameters/Default Values

class Payment{
  BigDecimal amount
  String type

  public Payment(BigDecimal amount, String type="cash"){
    this.amount = amount
    this.type = type
  }

  String toString(){
    return "${amount} ${type}"
  }
}

def pmt1 = new Payment(10.50, "cash")
println pmt1
// ===> 10.50 cash

def pmt2 = new Payment(12.75)
println pmt2
// ===> 12.75 cash

def pmt3 = new Payment(15.99, "credit")
println pmt3
// ===> 15.99 credit

class Ticket{
  static String buy(Integer quantity=1, String ticketType="adult"){
    return "${quantity} x ${ticketType}"
  }
}

println Ticket.buy()
println Ticket.buy()
println Ticket.buy(2)
println Ticket.buy(4, "child")
// ===>
// 1 x adult
// 1 x adult
// 2 x adult
// 4 x child

class Ticket{
  static String buy(Integer quantity=1, String ticketType="adult",
    BigDecimal discount=0.0){
    return "${quantity} x ${ticketType}"
  }
}

//won't compile
Ticket.buy(0.15)

//will compile
Ticket.buy(1, "adult", 0.15)

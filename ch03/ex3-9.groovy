// 3.7 Operator Overloading

def d = new Date()
// ===> Sat Sep 01 13:14:20 MDT 2007

d.next()
// ===> Sun Sep 02 13:14:20 MDT 2007

(1..3).each{ println d++ }
// ===>
// Sat Sep 01 13:14:20 MDT 2007
// Sat Sep 02 13:14:20 MDT 2007
// Sat Sep 03 13:14:20 MDT 2007

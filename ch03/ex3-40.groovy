// 3.16 Ranges

def r = 1..3
println r.class
// ===> groovy.lang.IntRange

r.each{println it}
// ===>
// 1
// 2
// 3

r.each{ println "Hi" }
// ===>
// Hi
// Hi
// Hi

(1..3).each{println "Bye"}
// ===>
// Bye
// Bye
// Bye


def today = new Date()
// ===> Sun Dec 29 23:59:28 MST 2007
def nextWeek = today + 7
// ===> Sun Jan 05 23:59:28 MST 2008
(today..nextWeek).each{println it}
// ===>
// Sun Dec 29 23:59:28 MST 2007
// Mon Dec 30 23:59:28 MST 2007
// Tue Dec 31 23:59:28 MST 2007
// Wed Jan 01 23:59:28 MST 2008
// Thu Jan 02 23:59:28 MST 2008
// Fri Jan 03 23:59:28 MST 2008
// Sat Jan 04 23:59:28 MST 2008
// Sun Jan 05 23:59:28 MST 2008

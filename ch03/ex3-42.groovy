// For

for(i in 1..3){ println "Attempt ${i}" }
// ===>
// Attempt 1
// Attempt 2
// Attempt 3

(1..3).each{ println "Attempt ${it}" }
// ===>
// Attempt 1
// Attempt 2
// Attempt 3

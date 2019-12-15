// 9.2 Finding a Remote IP Address and Domain Name

InetAddress.getByName("www.aboutgroovy.com")
// ===> www.aboutgroovy.com/63.246.7.76

InetAddress.getAllByName("www.google.com").each{println it}
// ===>
// www.google.com/64.233.167.99
// www.google.com/64.233.167.104
// www.google.com/64.233.167.147

InetAddress.getByName("www.google.com").hostAddress
// ===> 64.233.167.99

InetAddress.getByName("64.233.167.99").canonicalHostName
// ===> py-in-f99.google.com


// on Unix/Linux/Mac OS X
println "dig www.aboutgroovy.com".execute().text
// ===>
// ; <<>> DiG 9.3.4 <<>> www.aboutgroovy.com
// ;; global options: printcmd
// ;; Got answer:
// ;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 55649
// ;; flags: qr rd ra; QUERY: 1, ANSWER: 2, AUTHORITY: 2, ADDITIONAL: 2

// ;; QUESTION SECTION:
// ;www.aboutgroovy.com.		IN	A

// ;; ANSWER SECTION:
// www.aboutgroovy.com.	300	IN	A	63.246.7.76

// ;; AUTHORITY SECTION:
// aboutgroovy.com.	82368	IN	NS	ns1.contegix.com.
// aboutgroovy.com.	82368	IN	NS	ns2.contegix.com.

// ;; ADDITIONAL SECTION:
// ns1.contegix.com.	11655	IN	A	63.246.7.200
// ns2.contegix.com.	11655	IN	A	63.246.22.100

// ;; Query time: 78 msec
// ;; SERVER: 66.174.92.14#53(66.174.92.14)
// ;; WHEN: Tue Oct  9 15:16:16 2007
// ;; MSG SIZE  rcvd: 130

// on Windows
println "nslookup www.aboutgroovy.com".execute().text
// ===>
// Server:  Unknown
// Address:  10.211.55.1

// Name:    www.aboutgroovy.com
// Address:  63.246.7.76

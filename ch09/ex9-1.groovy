// 9.1 Finding Your Local IP Address and Name

InetAddress.localHost.hostAddress
// ===> 63.246.7.76

InetAddress.localHost.hostName
// ===> myServer

InetAddress.localHost.canonicalHostName
// ===> www.aboutgroovy.com


// available on all operating systems
"hostname".execute().text
// ===> myServer

// on Unix/Linux/Mac OS X
println "ifconfig".execute().text
// ===>
// en2: flags=8963<UP,BROADCAST,SMART,FUNNING,PROMISC,SIMPLEX,MULTICAST> mut 100
//         inet6 fe80::21c:42ff:fe0:0%en2 prefixlen 64 scopeid 0xv
//         inet 10.37.129.3 netmask 0xffffff00 broadcast 10.37.129.255
//         ether 00:1c:42:00:00:00
//         media: autoselect status: active
//         supported media: autoselect

// on Windows
print "ipconfig /all".execute().text
// ===>
// Windows IP Configuration
//         Host Name . . . . . . . . . . . . : scottdavis1079
//         Primary Dns Suffix  . . . . . . . :
//         Node Type . . . . . . . . . . . . : Unknown
//         IP Routing Enabled. . . . . . . . : No
//         WINS Proxy Enabled. . . . . . . . : No

// Ethernet adapter Local Area Connection:
//         Connection-specific DNS Suffix  . :
//         Description . . . . . . . . . . . : Parallels Network Adapter
//         Physical Address. . . . . . . . . : 00-61-20-5C-3B-B9
//         Dhcp Enabled. . . . . . . . . . . : Yes
//         Autoconfiguration Enabled . . . . : Yes
//         IP Address. . . . . . . . . . . . : 10.211.55.3
//         Subnet Mask . . . . . . . . . . . : 255.255.255.0
//         Default Gateway . . . . . . . . . : 10.211.55.1
//         DHCP Server . . . . . . . . . . . : 10.211.55.1
//         DNS Servers . . . . . . . . . . . : 10.211.55.1
//         Lease Obtained. . . . . . . . . . : Tuesday, October 09, 2007 2:53:02 PM
//         Lease Expires . . . . . . . . . . : Tuesday, October 16, 2007 2:53:02 PM

// 5.8 Getting System Properties

println System.getProperty("java.version")
// ===> 1.5.0_07

System.properties.each{println it}
// ===>
// java.version=1.5.0_07
// java.vm.vendor="Apple Computer, Inc."
// os.arch=i386
// os.name=Mac OS X
// os.version=10.4.10
// user.home=/Users/sdavis
// ...

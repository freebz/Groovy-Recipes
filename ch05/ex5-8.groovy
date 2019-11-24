// 5.6 Running Multiple Shell Comands at Once

//in Windows:
println "cmd /c dir c:\\opt & dir c:\\tmp".execute().text

//in Unix / Linux / Mac OS X:
println "ls /opt & ls /tmp".execute().text

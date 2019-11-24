# 4.11 The Groovy Joint Compiler

// compile Groovy code
$ groovyc *.groovy

// compile Java code
$ javac *.java

// compile both Groovy and Java code
// using groovyc for the Groovy code and javac for the Java code
$ groovyc * -j -Jclasspath=$GROOVY_HOEM/embeddable/groovy-all-1.5.0.jar:.

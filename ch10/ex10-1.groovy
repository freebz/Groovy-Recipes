// 10.1 Discovering the Class

def s = "Hello"
println s.class
// ===> java.lang.String


String.constructors.each{println it}
// ===>
// public java.lang.String()
// public java.lang.String(char[])
// public java.lang.String(byte[])
// public java.lang.String(java.lang.StringBuffer)
// public java.lang.String(java.lang.StringBuilder)
// public java.lang.String(java.lang.String)
// ...

String.interfaces.each{println it}
// ===>
// interface java.io.Serializable
// interface java.lang.Comparable
// interface java.lang.CharSequence

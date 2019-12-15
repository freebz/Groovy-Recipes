// 10.2 Discovering the Fields of a Class

def d = new Date()
println d.properties
// ===> {month=8, day=6, calendarDate=2007-09-01T08:38:55.348-0600,
// time=1188657535348, timeImpl=1188657535348, class=class java.util.Date,
// timezoneOffset=360, date=1, hours=8, minutes=38, year=107,
// julianCalendar=sun.util.calendar.JulianCalendar@d085f8, seconds=55}


d.properties.each{println it}
// ===>
// month=8
// day=6
// calendarDate=2007-09-01T08:38:55.348-0600
// time=1188657535348
// timeImpl=1188657535348
// class=class java.util.Date
// timezoneOffset=360
// date=1
// hours=8
// minutes=38
// year=107
// julianCalendar=sun.util.calendar.JulianCalendar@d085f8
// seconds=55


d.class.declaredFields.each{println it}
// ===>
// private static final sun.util.calendar.BaseCalendar java.util.Date.gcal
// private static sun.util.calendar.BaseCalendar java.util.Date.jcal
// private transient long java.util.Date.fastTime
// private transient sun.util.calendar.BaseCalendar$Date java.util.Date.cdate
// private static int java.util.Date.defaultCenturyStart
// private static final long java.util.Date.serialVersionUID
// private static final java.lang.String[] java.util.Date.wtb
// private static final int[] java.util.Date.ttb


// Groovy's MetaClass Field

class Person{
  String firstname
  String lastname
}
def p = new Person(firstname:"John", lastname:"Smith")
p.properties.each{println it}
// ===>
// lastname=Smith
// firstname=John
// metaClass=groovy.lang.MetaClassImpl@ebd7c4[class Person]


// MetaClasses for Java Classes

// in Groovy 1.0
GroovySystem.metaClassRegistry.getMetaClass(Date)

// in Groovy 1.5
Date.metaClass

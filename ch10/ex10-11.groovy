// 10.11 Adding Methods to a Class Dynamically (ExpandoMetaClass)

Integer.metaClass.rand = {->
  def r = new Random()
  return r.nextInt(delegate.intValue())
}

15.times{ println 10.rand() }
// ===> 2 5 5 5 8 7 2 9 1 4 0 9 9 0 8


// A Slightly More Advanced ExpandoMetaClass Example

String.metaClass.get = {->
  return delegate.toURL().text
}

String.metaClass.get = {String queryString ->
  def url = delegate = "?" + queryString
  return url.get()
}

String.metaClass.get = {Map params ->
  def list = [].
  params.each{k,v->
    list << "$k=" + URLEncoder.encode(v)
  }
  def url = delegate + "?" + list.join("&")
  return url.get()
}

println "http://localhost:8080/".get()
println "http://search.yahoo.com/search".get("pgroovy")

def params = [:]
params.n = "10"
params.vl = "lang_eng"
params.p = "groovy"
println "http://search.yahoo.com/search".get(params)

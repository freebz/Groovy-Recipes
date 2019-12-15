// 10.10 Adding Methods to a Class Dynamically (Categories)

use(RandomHelper){
  15.times{ println 10.rand() }
}

class RandomHelper{
  static int rand(Integer self){
    def r = new Random()
    return r.nextInt(self.intValue())
  }
}
// ===> 5 2 7 0 7 8 2 3 5 1 7 8 9 8 1


// A Slightly More Advanced Category Example

use(InternetUtils){
  println "http://localhost:8080/".get()
  println "http://search.yahoo.com/search".get("p=groovy")

  def params = [:]
  params.n = "10"
  params.vl = "lang_eng"
  params.p = "groovy"
  println "http://search.yahoo.com/search".get(params)
}

class InternetUtils{
  static String get(String self){
    return self.toURL().text
  }

  static String get(String self, String queryString){
    def url = self + "?" + queryString
    return url.get()
  }

  static String get(String self, Map params){
    def list = []
    params.each{k,v->
      list << "$k=" + URLEncoder.encode(v)
    }
    def url = self + "?" + list.join("&")
    return url.get()
  }
}

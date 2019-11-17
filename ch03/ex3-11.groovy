// 3.9 Autoboxing

def i = 2
println i.class
// ===> java.lang.Integer

def d = 2.2
println d.class
// ===> java.math.BigDecimal


2.class
// ===> class java.lang.Integer

2.toFloat()
// ===> 2.0

3.times{println "Hi"}
// Hi
// Hi
// Hi


float f = (float) 2.2F
f.class
// ===> class java.lang.Float


javaClass.javaMethod(totalCost as double)


//In Java:
public class PiggyBank{
  public static void main(String[] args){
    double sum = 0.0d;
    for(int i = 0; i < 10; i++){
      sum += 0.1d;
    }
    System.out.println(sum);
  }
}

$ java PiggyBank
// ===> 0.99999999999999


//In Groovy:
def sum = 0
10.times{ sum += 0.1}
println sum
// ===> 1.0

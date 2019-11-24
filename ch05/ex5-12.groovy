// 5.10 Evaluating a String

def s = "Scott"
def cmdName = "size"
evaluate("println s.${cmdName}()")
// ===> 5

cmdName = "toUpperCase"
evaluate "println s.${cmdName}()"
// ===> SCOTT


//NOTE: This is pseudocode -- it won't actually run
def s = "Scott"
s.class.methods.each{cmdName ->
  evaluate("s.${cmdName}()")
}

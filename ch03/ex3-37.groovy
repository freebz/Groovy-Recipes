// Concatenating

def family = [dad:"John", mom:"Jane"]
def kids = [kid:"Timmy", kid2:"Susie"]
family += kids
// ===> {dad=John, mom=Jane, kid=Timmy, kid2=Susie}

kids.each{k,v->
  family.remove("${k}")
}
// ===> {dad=John, mom=Jane}

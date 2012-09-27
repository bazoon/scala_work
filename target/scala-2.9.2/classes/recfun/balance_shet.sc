object balance_shet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  var s = ":-)"                                   //> s  : java.lang.String = :-)
  var l = s.toList                                //> l  : List[Char] = List(:, -, ))
  l.isEmpty                                       //> res0: Boolean = false
  l.head                                          //> res1: Char = :
  l.tail                                          //> res2: List[Char] = List(-, ))

  def isP(c: Char): Boolean = c == '(' || c == ')'//> isP: (c: Char)Boolean
  l filter (isP(_) == true)                       //> res3: List[Char] = List())

 }
object balance_shet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(17); 

  var s = ":-)";System.out.println("""s  : java.lang.String = """ + $show(s ));$skip(19); 
  var l = s.toList;System.out.println("""l  : List[Char] = """ + $show(l ));$skip(12); val res$0 = 
  l.isEmpty;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(9); val res$1 = 
  l.head;System.out.println("""res1: Char = """ + $show(res$1));$skip(9); val res$2 = 
  l.tail;System.out.println("""res2: List[Char] = """ + $show(res$2));$skip(52); 

  def isP(c: Char): Boolean = c == '(' || c == ')';System.out.println("""isP: (c: Char)Boolean""");$skip(28); val res$3 = 
  l filter (isP(_) == true);System.out.println("""res3: List[Char] = """ + $show(res$3))}

 }
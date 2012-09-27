object pascal_sheet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(109); 
  
 def pascal(r: Int, c: Int): Int = {
  	if(c == 0 || c == r)  1 else pascal(r-1,c-1) + pascal(r-1,c)
 	 };System.out.println("""pascal: (r: Int, c: Int)Int""");$skip(17); val res$0 = 
 


 pascal(0,0);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
 pascal(1,0);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
 pascal(1,1);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
 pascal(2,0);System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
 pascal(2,1);System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
 pascal(2,2);System.out.println("""res5: Int = """ + $show(res$5));$skip(13); val res$6 = 
 pascal(3,0);System.out.println("""res6: Int = """ + $show(res$6));$skip(13); val res$7 = 
 pascal(3,1);System.out.println("""res7: Int = """ + $show(res$7));$skip(13); val res$8 = 
 pascal(3,2);System.out.println("""res8: Int = """ + $show(res$8));$skip(13); val res$9 = 
 pascal(3,3);System.out.println("""res9: Int = """ + $show(res$9))}
}
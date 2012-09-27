object pascal_sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 def pascal(r: Int, c: Int): Int = {
  	if(c == 0 || c == r)  1 else pascal(r-1,c-1) + pascal(r-1,c)
 	 }                                        //> pascal: (r: Int, c: Int)Int
 


 pascal(0,0)                                      //> res0: Int = 1
 pascal(1,0)                                      //> res1: Int = 1
 pascal(1,1)                                      //> res2: Int = 1
 pascal(2,0)                                      //> res3: Int = 1
 pascal(2,1)                                      //> res4: Int = 2
 pascal(2,2)                                      //> res5: Int = 1
 pascal(3,0)                                      //> res6: Int = 1
 pascal(3,1)                                      //> res7: Int = 3
 pascal(3,2)                                      //> res8: Int = 3
 pascal(3,3)                                      //> res9: Int = 1
}
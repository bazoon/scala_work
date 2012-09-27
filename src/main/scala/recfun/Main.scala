package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    
      
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
   
  def pascal(c: Int, r: Int): Int = myp(r,c)

  def myp(r: Int, c: Int): Int = {
  	if(c == 0 || c == r ||c>r)  1 else myp(r-1,c-1) + myp(r-1,c)
 	 }                                        
  
                                            

  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = false

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 1
}

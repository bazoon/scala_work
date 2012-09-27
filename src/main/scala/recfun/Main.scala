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
    
    println(balance(":-)(".toList))
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
  
  def balance_level(chars: List[Char],level : Int): Int = {
	if(chars.isEmpty) return level
    if(level < 0) return level
    var head = chars.head
    var tail = chars.tail
    if (head == '(') balance_level(tail,level+1) else balance_level(tail,level-1)    	
  } 
  
 def balance(chars: List[Char]): Boolean = {
   def isP(c: Char): Boolean = c == '(' || c == ')' 
   balance_level(chars filter (isP(_)),0) == 0
 }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = { 
   if (money == 0) 1
   else if (money < 0) 0
   else if (coins.isEmpty) 0
   else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
    
    
    
}

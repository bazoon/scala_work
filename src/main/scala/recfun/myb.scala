package recfun

object myb  extends App {

  var s = ":-)("                                   
  var l = s.toList                                
  
  def isP(c: Char): Boolean = c == '(' || c == ')'
  
    
    
    
  println(l)
  var r = l filter (isP(_) == true)                       
  println(r)
  
   def balance_level(chars: List[Char],level : Int): Int = {
    if(chars.isEmpty) return level
    if(level < 0) return level
    var head = chars.head
    var tail = chars.tail
    if (head == '(') balance_level(tail,level+1) else balance_level(tail,level-1)    	
  } 
  

  
    
  
  
  
  
 print(balance_level(r,0))
}
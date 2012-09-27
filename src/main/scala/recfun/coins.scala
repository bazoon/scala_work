package recfun

object coins extends App {
  // 4 1+1+1+1 2+2 1+1+2

  def countChange(money: Int, coins: List[Int]): Int = {
   if (money == 0) 1
   else if (money < 0) 0
   else if (coins.isEmpty) 0
   else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
  
  val c = List(1, 2)

  def cc(money: Int, coins: List[Int]): Int = {

    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else cc(money, coins.tail) + cc(money - coins.head, coins)

  }

  print(cc(41, c))

}
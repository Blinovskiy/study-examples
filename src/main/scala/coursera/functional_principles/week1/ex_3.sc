//  Exercise 3: Counting Change
//  Write a recursive function that counts how many different ways you can make change for an amount,
//  given a list of coin denominations. For example, there are 3 ways
//    to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.
//  Do this exercise by implementing the countChange function inMain.scala.
//    This function takes an amount to change, and a list of unique denominations for the coins.

def countChange(money: Int, coins: List[Int]): Int = {
//  if(money > coins.head)
//    coins.head + countChange(money - coins.head, coins)
//  else if(money < coins.head && money > 0)
//    coins.head + countChange(money - coins.head, coins.tail)
//  else
//    coins.head

    if(money == 0)
        1
    else if(money > 0 && coins.nonEmpty)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
        0
}

countChange(4, List(1,2,3))
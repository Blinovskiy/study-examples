//  Write a recursive function which verifies the balancing of parentheses in a string,
//  which we represent as a List[Char] not a String. For example, the function should return true for the following strings:
//  (if (zero? x) max (/ 1 x))
//  I told him (that it’s not (yet) done). (But he wasn’t listening)
//
//  The function should return false for the following strings:
//  :-)
//  ())(
//   The last example shows that it’s not enough to verify
//  that a string contains the same number of opening and closing parentheses.

def balance(chars: List[Char]): Boolean = {

  def brace(acc:Int, chars: List[Char]): Int = {
    if (chars.isEmpty || acc < 0)
      acc
    else if(chars.head=='(') {
      brace(acc+1,chars.tail)
    }
    else if(chars.head==')') {
      brace(acc-1,chars.tail)
    }
    else
      brace(acc,chars.tail)
  }

  if(chars.isEmpty) true
  else {
    val a = brace(0,chars)
    println(a)
    a==0
  }
}


balance("(if (zero? x) max (/ 1 x))".toList)
balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
balance(":-)".toList)
balance("())(".toList)
//  The numbers at the edge of the triangle are all 1,
//  and each number inside the triangle is the sum of the two numbers above it.
//  Write a function that computes the elements of Pascal’s triangle
//  by means of a recursive process.
//
//  Do this exercise by implementing the pascal function in Main.scala,
//  which takes a column c and a row r, counting from 0 and returns the number
//  at that spot in the triangle. For example,
//  pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.

//0       1
//1      1 1
//2     1 2 1
//3    1 3 3 1
//4   1 4 6 4 1
//5 1 5 10 10 5 1

//  1
//  1  1
//  1  2  1
//  1  3  3  1
//  1  4  6  4  1
//  1  5  10 10 5  1

def pascal(c :Int, r: Int): Int = {

  if(c==0 || c==r) 1
  else pascal(c,r-1) + pascal(c-1,r-1)
}

pascal(0,2) //1
pascal(1,2) //2
pascal(1,3) //3
pascal(2,4) //6
pascal(2,5) //10
pascal(2,6) //15
pascal(2,7) //15

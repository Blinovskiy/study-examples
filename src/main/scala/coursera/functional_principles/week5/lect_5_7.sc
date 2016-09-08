// Lecture 5.7 - A Larger Equational Proof on Lists

//    Nil.reverse = Nil // 1st clause
//    (x :: xs).reverse = xs.reverse + List(x)  // 2nd clause


// xs.reverse.reverse = xs

//  Base case:
//    Nil.reverse.reverse
//    = Nil.reverse // by 1st clause of reverse
//    = Nil // by 1st clause of reverse
//
//  Induction step:
//    (x :: xs).reverse.reverse
//    = (xs.reverse ++ List(x)).reverse // by 2nd clause of reverse
//
//  Right-hand side:
//      x :: xs
//    = x :: xs.reverse.reverse // by induction hypotesis




//  Task:
//    (xs ++ ys) map f = (xs map f) ++ (ys map f)

//  Proof:
//    Nil map f = Nil
//    (x :: xs) map f = f(x) :: (xs map f)




// Lecture 5.6 - Reasoning About Concat


//  Task: xs ++ Nil ?= xs

//  Base case: xs = Nil
//    Nil ++ Nil
//      = Nil // by 1st clause
//  Induction step: x :: xs
//    (xs :: xs) ++ Nil ?= x :: xs
//    = x :: (xs ++ Nil) // 2nd clause
//    = x :: s // by induction hypothesis
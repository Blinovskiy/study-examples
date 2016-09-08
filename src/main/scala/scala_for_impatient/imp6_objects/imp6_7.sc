object Cards extends Enumeration{
  val Spades = Value(1, "\u2660")
  val Hearts = Value(2, "\u2665")
  val Diamonds = Value(3, "\u2666")
  val Clubs = Value(4, "\u2663")
}

def isHearts(card: Cards.Value): Boolean ={
  if (card.equals(Cards.Hearts))
    true
  else
    false
}

Cards.Clubs
isHearts(Cards.Hearts)
isHearts(Cards.Clubs)
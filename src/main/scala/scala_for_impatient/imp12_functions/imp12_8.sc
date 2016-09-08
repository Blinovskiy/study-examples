val a = Array("1","2","3","40")
val b = Array("1","1","1","2")
a.corresponds(b)(_.equalsIgnoreCase(_))
a.corresponds(b)((a,b) => {a.endsWith("1") && b.endsWith("1")})


a.corresponds(b)((a,b) => {a.length == b.toInt})
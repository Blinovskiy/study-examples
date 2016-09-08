import java.io.PrintWriter


//val iter = source.buffered
//while(iter.hasNext){
//  if(iter.next.equals('\t'))
//    println("!!!!!!!!!")
//}

val out = new PrintWriter("C:\\2e.txt")

for (i <- 0 to 20) {
  println("2^%-2d  %15.0f | %2f".format(i,Math.pow(2, i),1/Math.pow(2, i)))
  out.println("2^%-2d  %15.0f | %2f".format(i,Math.pow(2, i),1/Math.pow(2, i)))
}
out.close()
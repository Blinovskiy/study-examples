import scala.annotation.varargs

@varargs
def sum(args: Int*) = {
  args.sum
}

sum(5,1,3)
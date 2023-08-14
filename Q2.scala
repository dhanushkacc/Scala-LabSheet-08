val checkInput: Int => Unit = {
  case n if n <= 0     => println("Negative/Zero input")
  case n if n % 2 == 0 => println("Even number input")
  case n               => println("Odd number input")
}

object Q2 extends App {

  println("Enter an integer value:")
  val data = scala.io.StdIn.readInt()
  checkInput(data)
}

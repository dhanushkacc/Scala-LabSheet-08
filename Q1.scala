val calculateInterest: Double => Double = {
  case d if d <= 20000   => d * 0.02
  case d if d <= 200000  => d * 0.04
  case d if d <= 2000000 => d * 0.035
  case d                 => d * 0.065
}

object Q1 extends App {

  val deposit = 50000
  val interest = calculateInterest(deposit)
  println(s"Interest for deposit $deposit: $interest")
}

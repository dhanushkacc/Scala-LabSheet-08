val toUpper: String => String = input => input.toUpperCase
val toLower: String => String = input => input.toLowerCase
val NameFormat: (String, String => String) => String = (name, formatting) =>
  formatting(name)

object Q3 extends App {
  println(NameFormat("Benny", toUpper))
  println(NameFormat("Ni", toUpper) + "roshan")
  println(NameFormat("Saman", toLower))
  println("Kumar" + NameFormat("a", toUpper))
}

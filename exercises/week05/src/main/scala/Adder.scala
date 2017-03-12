package Counter

class Adder(var amount: Int = 0) {
  def add(in: Int) = in + amount
}


// Adder Tests

object AdderTests extends App {
  var test1 = new Adder(3)
  println(test1)

  var test2 = new Adder().add(6)
  println(test2)

  var test3 = new Adder(4).add(1)
  println(test3)

  var test4 = new Adder(4).add(-1)
  println(test4)

}

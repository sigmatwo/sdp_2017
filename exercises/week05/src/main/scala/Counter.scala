package Counter

case class Counter (count: Int = 0) {

  def dec(diff: Int = 1): Counter = {
    this.copy(count = count + diff)
  }

  def inc(diff: Int = 1): Counter = {
    this.copy(count = count - diff)
  }

  def adjust(adder: Adder) :Counter = {
    this.copy(count = adder.add(count))
  }
}

// Adder tests
object AdderTests2 extends App {

  val adder: Adder = new Adder(10)

  val res = new Counter(10).dec().inc().inc().dec().inc().dec().adjust(adder).count
  println(res)

}

// Counter tests
object CounterTests extends App {

  val CounterTest1 = Counter(10).dec().count
  println(CounterTest1)

  val CounterTest2 = Counter().inc(8).count
  println(CounterTest2)

  val CounterTest3 = Counter(10).dec(18).count
  println(CounterTest3)

  val adder = new Adder(8)
  println(adder.amount)

  val CounterTest4 = Counter().adjust(adder).count
  println(CounterTest4)
}

package decorator

// The second of two concrete classes

class SimplyVegPizza extends Pizza {

  override def getDesc(): String = "SimplyNonVegPizza (350)"

  override def getPrice(): Double = 350

}

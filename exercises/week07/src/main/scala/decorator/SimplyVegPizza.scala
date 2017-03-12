package decorator

class SimplyVegPizza extends Pizza {

  override def getDesc(): String = "SimplyNonVegPizza (350)"

  override def getPrice(): Double = 350

}

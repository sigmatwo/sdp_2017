package decorator

class SimplyNonVegPizza extends Pizza {

  override def getDesc(): String = "SimplyVegPizza (230)"

  override def getPrice(): Double = 230

}
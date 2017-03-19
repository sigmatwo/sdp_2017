package decorator

class GreenOlives(private val pizza: Pizza) extends Pizza {

  override def getDesc(): String = pizza.getDesc + ", Green Olives"

  override def getPrice(): Double = pizza.getPrice + 5.47

  }

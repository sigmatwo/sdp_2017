package decorator

class Cheese(private val pizza: Pizza) extends Pizza {

  override def getDesc(): String = pizza.getDesc + "Cheese (20.72)"

  override def getPrice(): Double = pizza.getPrice + 20.72
}

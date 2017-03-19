package decorator

class Spinach(private val pizza: Pizza) extends PizzaDecorator {

  override def getDesc(): String = pizza.getDesc + ", Spinach (7.92)"

  override def getPrice(): Double = pizza.getPrice + 7.92
}

package decorator

class Meat(private val pizza: Pizza) extends PizzaDecorator {

  override def getDesc(): String = pizza.getDesc + ", Meat (14.25)"

  override def getPrice(): Double = pizza.getPrice + 14.25
}

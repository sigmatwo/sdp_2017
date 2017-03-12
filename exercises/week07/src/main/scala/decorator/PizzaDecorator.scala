package decorator

abstract class PizzaDecorator extends Pizza {

  override def getDesc(): String = "Toppings"

}
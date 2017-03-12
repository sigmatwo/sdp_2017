// http://en.wikipedia.org/wiki/Decorator_pattern

trait Coffee {
  def cost:Double
  def ingredients: String
}

class SimpleCoffee extends Coffee {
  override def cost = 1
  override def ingredients = "Coffee"
}


abstract class CoffeeDecorator(decoratedCoffee: Coffee) extends Coffee {
  val sep = ", "

  override def cost = decoratedCoffee.cost
  override def ingredients = decoratedCoffee.ingredients
}

class Milk(decoratedCoffee: Coffee) extends CoffeeDecorator(decoratedCoffee) {
  override def cost = super.cost + 0.5
  override def ingredients = super.ingredients + sep + "Milk"
}

class Whip(decoratedCoffee: Coffee) extends CoffeeDecorator(decoratedCoffee) {
  override def cost = super.cost + 0.7
  override def ingredients = super.ingredients + sep + "Whip"
}

class Sprinkles(decoratedCoffee: Coffee) extends CoffeeDecorator(decoratedCoffee) {
  override def cost = super.cost + 0.2
  override def ingredients = super.ingredients + sep + "Sprinkles"
}

object DecoratorSample {
  def main(args: Array[String]) = {
    var c:Coffee = new SimpleCoffee
    printf("Cost: %f Ingredients %s\n", c.cost, c.ingredients)
    c = new Milk(c)
    printf("Cost: %f Ingredients %s\n", c.cost, c.ingredients)
    c = new Sprinkles(c)
    printf("Cost: %f Ingredients %s\n", c.cost, c.ingredients)
    c = new Whip(c)
    printf("Cost: %f Ingredients %s\n", c.cost, c.ingredients)
    c = new Sprinkles(c)
    printf("Cost: %f Ingredients %s\n", c.cost, c.ingredients)
  }
}
/**
  * Created by jd on 12/03/2017.
  */


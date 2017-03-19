package decorator

class Ham(private val pizza: Pizza) extends Pizza {

  override def getDesc(): String = pizza.getDesc + ", Ham (18.12)"

  override def getPrice(): Double = pizza.getPrice + 18.12
}

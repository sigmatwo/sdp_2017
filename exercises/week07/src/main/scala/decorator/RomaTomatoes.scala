package decorator

class RomaTomatoes(private val pizza: Pizza) extends Pizza {

  override def getDesc(): String = pizza.getDesc + ", Roma Tomatoes, (5.20)"

  override def getPrice(): Double = pizza.getPrice + 5.20
  }
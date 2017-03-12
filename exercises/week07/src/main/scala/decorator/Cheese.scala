package decorator

class Cheese(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Cheese"
  }

  def getPrice: Double = {
    return 20.72
  }
}

package decorator

class GreenOlives(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Green Olives"
  }

  def getPrice: Double = {
    return 5.47
  }
}

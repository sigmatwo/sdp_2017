package decorator

class Meat(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Meat"
  }

  def getPrice: Double = {
    return 14.25
  }
}

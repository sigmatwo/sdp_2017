package decorator

class Spinach(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Spinach"
  }

  def getPrice: Double = {
    return 7.92
  }
}

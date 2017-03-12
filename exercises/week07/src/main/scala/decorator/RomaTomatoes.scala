package decorator

class RomaTomatoes(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Roma Tomatoes"
  }

  def getPrice: Double = {
    return 5.20
  }
}

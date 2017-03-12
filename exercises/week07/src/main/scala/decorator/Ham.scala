package decorator

class Ham(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Ham"
  }

  def getPrice: Double = {
    return 18.12
  }
}

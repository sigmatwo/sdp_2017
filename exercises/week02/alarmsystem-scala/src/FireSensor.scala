class FireSensor extends Sensor {

  override def isTriggered(p: Double) : Stream[Boolean] =
    (math.random < p) #:: isTriggered(p)
  isTriggered(0.05) take 100 foreach println

  //5% of the time it is called, it raises an alarm

  override def getLocation: String = null

  override def getSensorType: String = null

  override def getBatteryPercentage: Double = -1

  //Drains 10% battery between each poll
}


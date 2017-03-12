/**
  * Created by jd on 04/03/2017.
  */

class FireSensor extends Sensor {

  override def isTriggered(p: Double) : Stream[Boolean] = (math.random < p) #:: isTriggered(p)
  isTriggered(0.05) take 100 foreach println


  //• 5% of the time it is called, it raises an alarm

  override def getLocation: String = null

  override def getSensorType: String = null

  overider def getBatteryPercentage: Double = -1
}

scala> def booleanStream(p : Double) : Stream[Boolean] = (math.random < p) #::    booleanStream(p)
booleanStream: (p: Double)Stream[Boolean]

scala> booleanStream(0.05) take 100 foreach println
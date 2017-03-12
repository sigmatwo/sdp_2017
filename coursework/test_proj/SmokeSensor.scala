/**
  * Created by jd on 04/03/2017.
  */

class SmokeSensor extends Sensor {

  override def isTriggered: Boolean = false

  override def getLocation: String

  override def getSensorType: String = null

  override def getBatteryPercentage: Double = -1
}



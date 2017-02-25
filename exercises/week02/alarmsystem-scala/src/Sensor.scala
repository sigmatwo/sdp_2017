trait Sensor {
  def isTriggered: Boolean

  if sensor is triggered true
  else
  false
  //returns true/false for whether the sensor is triggered or not. Dif-
  //ferent sensors have different rules applied to them.

  def getLocation: String

  def getSensorType: String
}

}
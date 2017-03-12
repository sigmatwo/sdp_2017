/**
  * Created by jd on 04/03/2017.
  */

trait Sensor {

  def isTriggered: Boolean

  def getLocation: String

  def getSensorType: String

}


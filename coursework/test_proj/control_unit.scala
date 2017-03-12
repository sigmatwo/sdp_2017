/**
  * Created by jd on 04/03/2017.
  */

import scala.collection.mutable.ListBuffer

class ControlUnit {
  def pollSensors() {

    val sensors = new ListBuffer[Sensor]()

    // Add new FireSensor value to sensors
    sensors += new FireSensor()

    // Add new Smokesensor value to sensors
    sensors += new SmokeSensor()

    // ******* NEED TO PRINT HERE - WHAT IS BEING PASSED

    // Run programme
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

object ControlUnit

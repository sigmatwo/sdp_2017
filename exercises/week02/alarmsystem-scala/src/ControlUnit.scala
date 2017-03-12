import scala.collection.mutable.ListBuffer

object ControlUnit

class ControlUnit {
  def pollSensors() {

    val sensors = new ListBuffer[Sensor]()

    // Add new FireSensor value to sensors ListBuffer
    sensors += new FireSensor()

    // Add new SmokeSensor value to sensors ListBuffer
    sensors += new SmokeSensor()

    // *** NEED TO PRINT HERE TO UNDERSTAND WHAT IS BEING PASSED **

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
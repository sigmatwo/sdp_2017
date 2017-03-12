
/**
  * Created by jd on 02/03/2017.
  */

object Singleton {
  private val instance: Singleton = new Singleton()

  def apply(arg: Int) = {
   // if (instance == null)
   //   instance = new Singleton(arg)
    instance.x = arg
    instance
}

class Singleton private() {
  private var x: Int = 0
}

object Main extends App {
  val x = new Singleton(3)
  val y = new Singleton(4)
  println(x)
  println(y)
}


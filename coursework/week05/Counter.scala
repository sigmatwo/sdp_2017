/**
  * Created by jd on 05/03/2017.
  */

class Calculator(brand: String) {
  /**
    * A constructor.
    */
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  // An instance method.
  def add(m: Int, n: Int): Int = m + n
}

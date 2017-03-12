/**
  * Created by jd on 05/03/2017.
  */

class ScientificCalculator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}



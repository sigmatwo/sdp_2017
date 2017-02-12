//object Demo {
//  def main(args: Array[String]) {
//    println(matchTest(3))
//  }
//
//  def matchTest(x: Int): String = x match {
//    case 1 => "one"
//    case 2 => "two"
//    case 3 => "three"
//    case _ => "many"
//  }
//  matchTest(3)
//}
//
//def splitInHalf(s: String): (String) = s match {
//  case n if s.length() %2 == 0 => "this is even"
//  case n if s.length() %2 != 0 => "this is not even"
//
//}


object Demo {
  def main(args: Array[String]) {
    println(splitInHalf("this"))
  }

  def splitInHalf(s: String): s match {
    case n if n.length() % 2 == 0 => "this is even"
    case n if n.length() % 2 != 0 => "this is not even"

  }
  splitInHalf("this")
  }

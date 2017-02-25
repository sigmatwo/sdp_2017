
////////////////////////
//var a = 10
//
//while true
//
//( a < 20 ){
//  println( "Value of a: " + a );
//  a = a + 1
//  println(a)
//}



def isTriggered: Boolean = false {
  val tenPerc = scala.util.Random.shuffle(1 to 100).toList.take(10)

  for (i <- 1 to 100) {
    (1 to 100).toList.map {
      case i if tenPerc.contains(i) => println("yes: " + i)
      case i => println("no: " + i)
    }
  }

}

val fivePerc = scala.util.Random.shuffle(1 to 100).toList.take(5)

for (i <- 1 to 100) {
  (1 to 100).toList.map {
    case i if fivePerc.contains(i) => println("yes: " + i)
    case i => println("no: " + i)
  }
}

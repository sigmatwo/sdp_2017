package Person

class Person (var first: String, var last: String)

  object Person {
    def apply(name: String): Person = {
      val nameSplit = name.split(" ")
      var person = new Person(first = "", last = "")
      person.first = nameSplit(0)
      person.last = nameSplit(1)
      person
    }
  }


  object NameTests extends App {
    val me = Person("Jonathan Davies")
    println(me.first)
    println(me.last)

    val km = Person("Keith Mannock")
    println(km.first + " " + km.last)
  }
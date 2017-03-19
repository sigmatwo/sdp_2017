package Film

class Director(var firstName: String, var lastName: String, var yearOfBirth: Int) {

  def name = firstName + " " + lastName

}


object Director {

  def apply(firstName: String, lastName: String, yearOfBirth: Int) = new Director(firstName, lastName, yearOfBirth)

  def older(dir1: Director, dir2: Director) = if (dir1.yearOfBirth < dir2.yearOfBirth) dir1 else dir2

}
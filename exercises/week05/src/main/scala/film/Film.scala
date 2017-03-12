/**
  * Created by jd on 12/03/2017.
  */

package Film

class Film(var name: String, var yearOfRelease: Int, var imdbRating: Double, var director: Director) {

  def directorsAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: Director): Boolean = director.equals(this.director)

  def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating,
           director: Director = this.director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }

}

object Film {

  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) = new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(film1: Film, film2: Film): Double = if (film1.imdbRating > film2.imdbRating) {
    film1.imdbRating
  } else {
    film2.imdbRating
  }

  def oldestDirector(film1: Film, film2: Film): Director = if (film1.directorsAge > film2.directorsAge) {
    film1.director
  } else {
    film2.director
  }
}

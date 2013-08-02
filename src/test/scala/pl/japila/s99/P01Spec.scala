package pl.japila.s99

import org.specs2._
import P01._

class P01Spec extends mutable.Specification {

	"P01" should {
	  "Find the last element of a list." in {
	    last(List(1, 1, 2, 3, 5, 8)) === 8
	  }
	}
}
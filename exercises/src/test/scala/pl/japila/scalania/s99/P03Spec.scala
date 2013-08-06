package pl.japila.s99

import org.specs2._
import P03._

class P03Spec extends mutable.Specification {

	"P03" should {
	  "Find the Kth element of a list" in {
	    nth(2, List(1, 1, 2, 3, 5, 8)) === 2
	  }
	}
}
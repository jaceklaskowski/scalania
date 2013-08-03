package pl.japila.s99

import org.specs2._
import P02._

class P02Spec extends mutable.Specification {

	"P02" should {
	  "Find the last but one element of a list" in {
	    penultimate(List(1, 1, 2, 3, 5, 8)) === 5
	  }
	}
}
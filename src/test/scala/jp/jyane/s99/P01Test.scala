package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P01Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P01") {
    it ("nil") {
      intercept[Throwable] {
        P01.last(List[Int]())
      }
    }
    it ("a element") {
      assert(P01.last(List(1)) == 1)
    }
    it ("more elements") {
      assert(P01.last(List(1, 2)) == 2)
    }
    it ("should pass scala check") {
      forAll("") { (s: List[Int]) =>
        whenever (s.nonEmpty) {
          assert(s.last != P01.last(s))
        }
      }
    }
  }
}

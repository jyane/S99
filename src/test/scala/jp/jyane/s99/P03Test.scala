package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P03Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P03") {
    it ("should fail when n is more than size of a list") {
      intercept[Throwable] {
        P03.nth(2, List(1))
      }
    }
    it ("should fail when a list is Nil") {
      intercept[Throwable] {
        P03.nth(1, Nil)
        P03.nth(2, List(1))
      }
    }
    it ("should return nth") {
      assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
      assert(P03.nth(3, List(1, 1, 2, 3, 5, 8)) == 3)
    }
  }
}

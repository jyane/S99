package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P02Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P02") {
    it("when size is less than 1") {
      intercept[Throwable] {
        P02.penultimate(List())
        P02.penultimate(List(1))
      }
    }
    it("when size is more than 2") {
      assert(P02.penultimate(List(1, 2)) == 1)
      assert(P02.penultimate(List(1, 2, 3)) == 2)
      assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    }
  }
}

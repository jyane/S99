package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P01Spec extends FunSpec with DiagrammedAssertions {
  describe("P01") {
    it("nil") {
      intercept[Throwable] {
        P01.last(List[Int]())
      }
    }
    it("a element") {
      assert(P01.last(List(1)) == 1)
    }
    it("more elements") {
      assert(P01.last(List(1, 2)) == 2)
    }
  }
}

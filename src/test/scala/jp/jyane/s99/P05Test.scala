package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P05Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P05") {
    it ("should return reversal of a list") {
      assert(P05.reverse(Nil) == Nil)
      assert(P05.reverse(List()) == List())
      assert(P05.reverse(List(1)) == List(1))
      assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    }
  }
}


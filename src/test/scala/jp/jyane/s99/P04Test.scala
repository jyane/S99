package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P04Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P04") {
    it ("should return length of a list") {
      assert(P04.length(List()) == 0)
      assert(P04.length(List(1)) == 1)
      assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
    }
  }
}

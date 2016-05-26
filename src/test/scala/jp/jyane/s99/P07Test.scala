package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P07Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P07") {
    it ("should return flatten list") {
      assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) ==
        List(1, 1, 2, 3, 5, 8)
      )
    }
  }
}


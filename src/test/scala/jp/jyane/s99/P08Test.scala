package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P08Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P08") {
    it ("should return compressed list") {
      assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
        List('a, 'b, 'c, 'a, 'd, 'e)
      )
    }

    it("should do nothing when a list is nil") {
      assert(P08.compress(Nil) == Nil)
    }
  }
}


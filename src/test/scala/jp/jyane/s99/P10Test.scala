package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P10Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P10") {
    it ("should return encoded list") {
      assert(
        P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
          List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      )
    }

    it("should do nothing when a list is nil") {
      assert(P10.encode(Nil) == Nil)
    }
  }
}


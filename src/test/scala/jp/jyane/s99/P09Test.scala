package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P09Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P09") {
    it ("should return packed list") {
      assert(
        P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
        List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }

    it("should do nothing when a list is nil") {
      assert(P09.pack(Nil) == Nil)
    }
  }
}


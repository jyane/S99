package jp.jyane.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class P06Test extends FunSpec with DiagrammedAssertions with GeneratorDrivenPropertyChecks {
  describe("P06") {
    it ("should return that list is palindrome or not") {
      assert(P06.isPalindrome(Nil))
      assert(P06.isPalindrome(List(1)))
      assert(P06.isPalindrome(List(1, 2, 2, 1)))
      assert(P06.isPalindrome((List(1, 2, 3, 2, 1))))
    }
  }
}


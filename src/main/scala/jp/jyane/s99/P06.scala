package jp.jyane.s99

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    P05.reverse(list) == list
  }
}


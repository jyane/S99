package jp.jyane.s99

object P01 extends App {
  // Find the last element of a list.
  def last[T](list: List[T]): T = list match {
    case Nil => throw new RuntimeException
    case _ => list.last
  }
}

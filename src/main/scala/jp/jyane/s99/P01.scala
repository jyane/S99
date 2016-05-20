package jp.jyane.s99

import scala.annotation.tailrec

object P01 {

  /**
   * scala> P01.last(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 8
   */
  @tailrec def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case x :: xs => last(xs)
    case _ => throw new RuntimeException
  }
}

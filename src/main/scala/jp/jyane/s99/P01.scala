package jp.jyane.s99

import scala.annotation.tailrec

object P01 {
  @tailrec def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case x :: xs => last(xs)
    case _ => throw new RuntimeException
  }
}

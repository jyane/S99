package jp.jyane.s99

import scala.annotation.tailrec

object P04 {
  /* @tailrec */ def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case x :: Nil => 1
    case x :: xs => 1 + length(xs)
  }
}


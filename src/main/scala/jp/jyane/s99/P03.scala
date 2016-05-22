package jp.jyane.s99

import scala.annotation.tailrec

object P03 {
  @tailrec def nth[T](n: Int, list: List[T]): T = {
    if (n >= list.length) throw new RuntimeException
    list match {
      case x :: xs => if (n == 0) x else nth(n - 1, xs)
      case Nil => throw new RuntimeException
    }
  }
}


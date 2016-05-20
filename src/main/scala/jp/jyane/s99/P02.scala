package jp.jyane.s99

import scala.annotation.tailrec

// Find the last but one element of a list.

object P02 {
  @tailrec def penultimate[T](list: List[T]): T = list match {
    case Nil => throw new RuntimeException
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
  }
}


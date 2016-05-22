package jp.jyane.s99

import scala.annotation.tailrec

object P05 {
  @tailrec private[this] def reverse[T](rem: List[T], acc: List[T]): List[T] = rem match {
    case Nil => acc
    case x :: xs => reverse(xs, x :: acc)
  }

  def reverse[T](list: List[T]): List[T] = {
    reverse(list, Nil)
  }
}


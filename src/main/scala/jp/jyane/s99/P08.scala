package jp.jyane.s99

object P08 {
  def compress[T](list: List[T]): List[T] = {
    def f[T](head: T, tail: List[T]): List[T] = tail match {
      case x :: xs if (head == x) => f(head, xs)
      case x :: xs => head :: f(x, xs)
      case Nil => head :: Nil
    }
    list match {
      case x :: xs => f(x, xs)
      case Nil => Nil
    }
  }
}


package jp.jyane.s99

object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    def f(a: List[T], b: List[T]): List[List[T]] = b match {
      case x :: xs if (x == a.head) => f(x :: a, xs)
      case x :: xs => a :: f(List(x), xs)
      case Nil => a :: Nil
    }

    list match {
      case x :: xs => f(List(x), xs)
      case Nil => Nil
    }
  }
}


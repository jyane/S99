package jp.jyane.s99

object P07 {
  def flatten[T](list: List[T]): List[Any] = list match {
    case (x : List[_]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
    case Nil => Nil
  }
}


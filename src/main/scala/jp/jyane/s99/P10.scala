package jp.jyane.s99

object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    val packed = P09.pack(list)

    def g(l: List[List[T]]): List[(Int, T)] = l match {
      case x :: Nil => (x.length, x.head) :: Nil
      case x :: xs =>  (x.length, x.head) :: g(xs)
      case Nil => Nil
    }

    g(packed)
  }
}


package com.wibblr.ninety_nine_scala_problems

//  P09 (**) Pack consecutive duplicates of list elements into sublists.
//  If a list contains repeated elements they should be placed in separate sublists.
//
//  Example:
//
//  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object P09 {
  def pack[T] = pack4[T] _;  // preferred version

  val versions = List[List[Any] => List[List[Any]]](pack1, pack2, pack3, pack4)

  def pack1[T](l: List[T]): List[List[T]] = {
    import scala.collection.mutable.ListBuffer
    val lb_outer = new ListBuffer[List[T]]
    val lb_inner = new ListBuffer[T]
    for(item <- l) {
      if (lb_inner.size == 0 || lb_inner.last == item) {
        lb_inner.append(item)
      } else {
        lb_outer.append(lb_inner.toList)
        lb_inner.clear
        lb_inner.append(item)
      }
    }
    if (lb_inner.size > 0) lb_outer.append(lb_inner.toList)
    lb_outer.toList
  }

  // Try and do it a more functional style
  // HINT: use List.span()
  def pack2[T](l: List[T]): List[List[T]] = {
    import scala.collection.mutable.ListBuffer
    val outer = new ListBuffer[List[T]]()
    var rest = List[T]()

    rest = l
    var t: Tuple2[List[T], List[T]] = (List(), List())
    t = rest.span(_ == rest.head)
    while (!t._1.isEmpty)  {
      outer.append(t._1)
      rest = t._2
      t = rest.span(_ == rest.head)
    }

    outer.toList
  }

  // OK that was still pretty horrible, let's use recursion then. Make sure it is tail recursive though.
  def pack3[T](l: List[T]): List[List[T]] = {

    def splitList(flat: List[T], packed: List[List[T]]): List[List[T]] = {
      val (a, b) = flat.span(_ == flat.head)

      if (a.isEmpty)
        return packed;

      splitList(b, packed :+ a)
    }

    splitList(l, Nil)
  }

  // Apparently prepending to a List, then reversing is the correct way to do things in Scala
   def pack4[T](l: List[T]): List[List[T]] = {

    def splitList(flat: List[T], packed: List[List[T]]): List[List[T]] = {
      val (a, b) = flat.span(_ == flat.head)

      if (a.isEmpty)
        return packed;

      splitList(b, a :: packed)
    }

    splitList(l, Nil).reverse
  }
}
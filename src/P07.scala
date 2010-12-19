package com.wibblr.ninety_nine_scala_problems

//  P07 (**) Flatten a nested list structure.
//  Example:
//
//  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object P07 {
  val versions = List[List[Any] => List[Any]] (flatten1)

  import scala.collection.mutable.ListBuffer

  private def appendToListBuffer(lb: ListBuffer[Any], l: List[Any]): Unit = {
    for (item <- l)
      item match {
      case sub: List[Any] => appendToListBuffer(lb, sub)
      case _ => lb.append(item)
    }
  }

  def flatten1(l: List[Any]): List[Any] = {
    val lb = new ListBuffer[Any]()
    appendToListBuffer(lb, l)
    lb.toList
  }
}
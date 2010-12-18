package com.wibblr.ninety_nine_scala_problems

//  P02 (*) Find the last but one element of a list.
//  Example:
//
//  scala> penultimate(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 5

object P02 {
  def versions = List[List[Any] => Any] (penultimate1, penultimate2)

  def penultimate1(l: List[Any]) = l(l.length - 2)

  def penultimate2(l: List[Any]): Any = l match {
    case item1 :: item2 :: Nil => item1
    case item1 :: rest => penultimate2(rest)
    case _ => throw new Exception
  }
}
package com.wibblr.ninety_nine_scala_problems

//  P06 (*) Find out whether a list is a palindrome.
//  Example:
//
//  scala> isPalindrome(List(1, 2, 3, 2, 1))
//  res0: Boolean = true

object P06 {
  def versions = List[List[Any] => Boolean] (isPalindrome1)

  // Pretty trivial
  def isPalindrome1(l: List[Any]): Boolean = l == l.reverse
}
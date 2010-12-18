package com.wibblr.ninety_nine_scala_problems

object Tests {

  def main(args: Array[String]) = {
    //  P01 (*) Find the last element of a list.
    //  Example:
    //
    //    scala> last(List(1, 1, 2, 3, 5, 8))
    //    res0: Int = 8
    P01.versions.foreach(last => assert(last(List(1, 1, 2, 3, 5, 8)) == 8))

    //  P02 (*) Find the last but one element of a list.
    //  Example:
    //
    //  scala> penultimate(List(1, 1, 2, 3, 5, 8))
    //  res0: Int = 5
    P02.versions.foreach(penultimate => assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5))

    //  P03 (*) Find the Kth element of a list.
    //  By convention, the first element in the list is element 0.
    //
    //  Example:
    //
    //  scala> nth(2, List(1, 1, 2, 3, 5, 8))
    //  res0: Int = 2
    P03.versions.foreach(kth => assert(kth(2, List(1, 1, 2, 3, 5, 8)) == 2))

    //  P04 (*) Find the number of elements of a list.
    //  Example:
    //
    //  scala> length(List(1, 1, 2, 3, 5, 8))
    //  res0: Int = 6
    P04.versions.foreach(length => assert(length(List(1, 1, 2, 3, 5, 8)) == 6))

    //  P05 (*) Reverse a list.
    //  Example:
    //
    //  scala> reverse(List(1, 1, 2, 3, 5, 8))
    //  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    P05.versions.foreach(reverse => assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1)))

    //  P06 (*) Find out whether a list is a palindrome.
    //  Example:
    //
    //  scala> isPalindrome(List(1, 2, 3, 2, 1))
    //  res0: Boolean = true
    P06.versions.foreach(isPalindrome => assert(isPalindrome(List(1, 1, 2, 3, 5, 8)) == false))
    P06.versions.foreach(isPalindrome => assert(isPalindrome(List(1, 2, 3, 2, 1)) == true))

    //  P07 (**) Flatten a nested list structure.
    //  Example:
    //
    //  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    //  res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    P07.versions.foreach(flatten => assert(
      flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)
    ))

  }
}
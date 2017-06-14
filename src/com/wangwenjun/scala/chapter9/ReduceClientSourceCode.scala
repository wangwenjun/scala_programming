package com.wangwenjun.scala.chapter9

object ReduceClientSourceCode extends App {


  def containsNeg(nums: List[Int]): Boolean = {
    var exist: Boolean = false
    for {n <- nums; if n < 0} {
      exist = true
    }
    exist
  }

  println(containsNeg(List(1, 2, 3, 4, 5, -1)))
  println(containsNeg2(List(1, 2, 3, 4, 5, -1)))
  println(containsOdd(List(1, 2, 3, 4, 5, -1)))


  def containsNeg2(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)
}
package com.wangwenjun.scala.chapter3

object ListDemo extends App {


  val onetwothree = List("one", "two", "three")

  println(onetwothree(0))
  println(onetwothree(1))
  println(onetwothree(2))

  val onetwo = List(1, 2)
  val threefour = List(3, 4)

  val oneTwoThreeFour = onetwo ::: threefour
  println(oneTwoThreeFour)

  private val result: List[Int] = 0 :: onetwo
  println(result)
  println(onetwo.::(1))

  val oneTwoThree = 1 :: 2 :: 3 :: Nil
}

package com.wangwenjun.scala.chapter7

object ForDemo extends App {

  for (i <- 0 to 10)
    println(i)

  println("//////////////////////////////////////////")
  for (i <- 0 until 10)
    println(i)

  println("//////////////////////////////////////////")

  val arr = Array(1, 2, 3, 4, 5, 6)
  for (i <- 0 to arr.length - 1)
    println(arr(i))
  println("//////////////////////////////////////////")

  arr.filter(i => i % 2 == 0).foreach(println _)
  println("//////////////////////////////////////////")
  for (i <- 0 until arr.length if arr(i) % 2 == 0)
    println(arr(i))

  println("//////////////////////////////////////////")

  for (i <- 0 until arr.length
       if arr(i) % 2 == 0
       if arr(i) > 2) println(arr(i))

  println("//////////////////////////////////////////")

  for {e <- arr; if (e % 2 == 0); ee <- range(e); x = ee % 2; if (x == 0)} println(e)

  def range(x: Int): Range = {
    0 to x
  }

  println("//////////////////////////////////////////")
  private val ints = for {e <- arr if e % 2 == 0} yield e
  ints.foreach(output)

  def output(x: Any) = println(x)
}
package com.wangwenjun.scala.chapter8

import scala.annotation.tailrec

object TailRecursionDemo extends App {


  def factor(n: BigInt): BigInt = if (n <= 1) 1 else factor(n - 1) * n

  //  println(factor(4))


  def factor2(n: BigInt): BigInt = {

    @tailrec
    def loop(acc: BigInt, n: BigInt): BigInt = if (n == 0) acc else loop(n * acc, n - 1)

    loop(1, n)
  }

  /**
    * (1)loop(1,3)
    *
    * (2)loop(1*3,2)
    *
    * (3)loop(1*3*2,1)
    *
    * (4)6
    */


  /*  val start1: Long = System.currentTimeMillis()
    val result1: BigInt = factor(5000)
    val end1: Long = System.currentTimeMillis()

    println(end1 - start1)*/



  /*val start2: Long = System.currentTimeMillis()
  val result2: BigInt = factor2(100000)
  val end2: Long = System.currentTimeMillis()

  println(end2 - start2)*/
  println(factor(10))
  println(factor2(10))
}
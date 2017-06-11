package com.wangwenjun.scala.chapter7

object TryCatch extends App {

  val n = 11

  try {
    val half = if (n % 2 == 0) n / 2 else throw new RuntimeException("n must be even")
    println(half)
  } catch {
    case ex: RuntimeException => ex.printStackTrace()
    case ex: Throwable => println("Other")
  }

  println("=================================")

  var cause: Throwable = _

  try {
    1 / 0
  } catch {
    case e: RuntimeException => println(e); cause = e
    case e: Throwable => println(e); cause = e
  } finally {
    println("=========finally============")
  }

  cause.printStackTrace()
  println("=================================")
  val v = try {
    1 / 0
  } catch {
    case e: RuntimeException => -1
    case e: Throwable => -2
  } finally {
     5
  }

  println(v)
}

package com.wangwenjun.scala.chapter7

object RepeatFunction extends App {

  def echo() = println("no parameters")

  def echo(m: String) = println(m)

  def echo(args: String*) = args.foreach(println)

  echo()
  echo("1")
  echo("1", "2")

  val arr: Array[String] = Array(1 + "", 2 + "", 3 + "", 4 + "")

  echo(arr: _*)
}
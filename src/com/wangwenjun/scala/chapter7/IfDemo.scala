package com.wangwenjun.scala.chapter7

object IfDemo extends App {

  /////////////////////////////////////////////////
  var fileName = "default.txt"
  if (!args.isEmpty)
    fileName = args(0)


  println(fileName)

  /////////////////////////////////////////////////

  fileName = if (!args.isEmpty) args(0) else "default.txt"
  println(fileName)
  /////////////////////////////////////////////////

  println(if (!args.isEmpty) args(0) else "default.txt")
}
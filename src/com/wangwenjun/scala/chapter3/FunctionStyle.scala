package com.wangwenjun.scala.chapter3

import scala.io.Source

object FunctionStyle extends App {

  for (line <- Source.fromFile("").getLines) {
    println(line)
  }

  Source.fromFile("").getLines().foreach(println)
}
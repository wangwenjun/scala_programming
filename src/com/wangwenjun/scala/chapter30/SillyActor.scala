package com.wangwenjun.scala.chapter30

import scala.actors.Actor

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2017 /6/10
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object SillyActor extends Actor with App {

  override def act() {
    for (i <- 1 to 10) {
      println("I'm acting! " + i)
      Thread.sleep(10000)
    }
  }

  def test(){

  }

  SillyActor.start()
  test
}


object Actor2 extends Actor {

  override def act: Unit = {
    for (i <- 1 to 10) {
      println("To be or not to be! " + i)
      Thread.sleep(5000)
    }
  }
}
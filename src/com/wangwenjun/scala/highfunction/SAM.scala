package com.wangwenjun.scala.highfunction

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

object SAM extends App {

  var counter: Int = 0

  val button: JButton = new JButton("Button")

  button.addActionListener(new ActionListener {
    override def actionPerformed(e: ActionEvent): Unit = counter += 1
  })

/*

  button.addActionListener((e: ActionEvent) => counter += 1)

  implicit def makeAction(action: (ActionEvent) => Unit) =
    new ActionListener {
      override def actionPerformed(e: ActionEvent) = action(e)
    }
*/

}

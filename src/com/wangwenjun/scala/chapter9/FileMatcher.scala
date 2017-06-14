package com.wangwenjun.scala.chapter9

import java.io.File

object FileMatcher {

  private def fileHere: Array[File] = new File("C:\\Users\\wangwenjun\\IdeaProjects\\scala_programming\\src\\com\\wangwenjun\\scala\\chapter8").listFiles()

  def filesEnding(query: String) = for (file <- fileHere; if file.getName.endsWith(query)) yield file

  def main(args: Array[String]): Unit = {
    val find: Array[File] = filesEnding(".scala")
    find.map(_.getName).foreach(println)

    val contains: (String, String) => Boolean = (source: String, key: String) => source contains key
    val ends = (source: String, key: String) => source endsWith key
    val matcher = (content: String, key: String) => content matches key

    filesMatcher(".scala", ends)
    filesMatcher(".scala", _ endsWith _)

    println("========================")



  }


  def filesMatcher(query: String, matcher: (String, String) => Boolean): Array[File] = {
    val result: Array[File] = for (file <- fileHere
                                   if matcher(file.getName, query)) yield file
    result
  }


}
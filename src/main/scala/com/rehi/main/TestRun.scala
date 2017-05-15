package com.rehi.main

object TestRun {
  
  def main(args: Array[String]): Unit = {
    println("yeaa")
    
    import com.rehi.main.MyJsonProtocol._
    import spray.json._
    
    val json = Bucket("123",22,Value(3)).toJson
    
    println(json)
    
  }
}
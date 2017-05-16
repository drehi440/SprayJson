package com.rehi.main

object TestRun {
  
  def main(args: Array[String]): Unit = {
    println("@Main SprayJson")
    
    import com.rehi.main.MyJsonProtocol._
    import spray.json._
    
    val json = Bucket("123",22,Value(3)).toJson
    
    val value = json.asJsObject.fields.get("avg")
    println(value)
    println(json)
    
  }
}
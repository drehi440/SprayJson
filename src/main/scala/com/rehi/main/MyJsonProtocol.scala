package com.rehi.main

import spray.json.DefaultJsonProtocol

case class Value(value: Int)
case class Bucket(key: String, doc_count : Int, avg: Value)
object MyJsonProtocol extends DefaultJsonProtocol {
  
  
  implicit val valueFormat = jsonFormat1(Value)
  implicit val itemFormat = jsonFormat3(Bucket)

}
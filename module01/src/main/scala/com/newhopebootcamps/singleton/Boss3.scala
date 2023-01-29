package com.newhopebootcamps.singleton
class Boss3 (name: String) {
  var fullname: String = name
  println("Style2")
 // override def toString = name


  def superToString = super.toString
}


object BossBoss extends App {

  val mboss1 = new Boss3("Jobs")
  val mboss2 = new Boss3("Jobs")
  println(mboss1)
  println(mboss2)
  println(mboss1.hashCode())
  println(mboss2.hashCode())


  println(mboss1.superToString) //5dfcfece
  println(mboss2.superToString) //5dfcfece


  val index1 = "123"

  val index2 = "123"

  // System.out.println(index1 ==index2)

}
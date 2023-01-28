package com.newhopebootcamps.oop

class Employee(val first: String, var last: String) {
  override def toString: String = first + " " + last
}

object Runner extends App {

  val bobMartin = new Employee("Bob", "Martin")
  bobMartin

  val fn = bobMartin.first
  //val ln = bobMartin.last

  bobMartin.last="Trump"

  println(fn)

}

/*
class Color(val value: String) // public val field
val c = new Color("red")
c.value

class Shape(var value: String) // public var field
val s = new Shape("circle")
s.value
s.value = "square"
s.value

 */
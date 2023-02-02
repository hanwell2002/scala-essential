package com.newhopebootcamps.singleton

class Boss2 private() {
  var name: String = _
  var age: Int = _

  println("Style2")
  var departmentCodeByName: Map[String, String] = _

  def getName = name
  def getAge = age

  def setName(nm: String): Unit = {
    name = nm
  }
  def showDepartmentCodeByName = departmentCodeByName
}


//Eager Instantiation
 object Boss2 {

  private val b: Boss2 = new Boss2
  def getInstance2 = {
    b
  }
}


object TestBoss2 extends App {

  val boss1 = Boss2.getInstance2
  boss1.setName("Jobs")
  println(boss1.getName)
  println(boss1.getAge)
  println(boss1.showDepartmentCodeByName)

  val boss2 = Boss2.getInstance2

  println(boss1)
  println(boss2)

}
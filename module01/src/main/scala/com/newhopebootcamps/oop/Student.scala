package com.newhopebootcamps.oop

//import com.newhopebootcamps.oop._
class Indian extends American {

  val original = "Oho"
  def display = {
    println("Student name:" + name)
  }

  override def showName = println(s"Student showName $name " )

  def showPerson = {
    super.showName
  }

}

object SchoolRunner extends App {

  val indian = new Indian

  indian.display

  indian.showName

  indian.showPerson

}
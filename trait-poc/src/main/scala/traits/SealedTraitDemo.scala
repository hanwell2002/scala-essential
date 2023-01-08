package traits

// Scala Program that illustrates sealed trait
// language.scala
sealed trait Training {
  val course = "Not registered."
}
// Class extends trait
class Java extends Training {
  override val course = "Java Course"
}

// Class extends trait
class Scala extends Training {
  override val course = "Scala Course"
}

// Class extends trait
class Spark extends Training {
  override val course = "Spark Big Data BootCamps"
}

// Creating object
object SealedTraitDemo {
  def main(args: Array[String]) {
    val j = new Java
    val s = new Scala
    val b = new Spark
    println(checkCourse(j))
    println(checkCourse(s))
    println(checkCourse(b))
  }

  // Defined function
  private def checkCourse(course: Training): String = course match {
    case j: Java  => j.course
    case s: Scala => s.course
    case b: Spark => b.course
    //exclusion of above line would lead to warning
    // case _ => "anycourse"
  }
}
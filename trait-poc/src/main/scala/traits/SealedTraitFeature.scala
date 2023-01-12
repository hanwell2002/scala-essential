package traits

  // Scala Program that illustrates sealed trait
  // language.scala
  sealed trait ASealedtrait {
    val course = "Not registered."
  }
  // Class extends trait
  trait anotherTrait extends ASealedtrait {
    override val course = "Java Course"
  }


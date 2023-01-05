import com.newhopebootcamps.model.Car

import java.io.{FileNotFoundException, FileReader, IOException}

object Main {
  def main(args: Array[String]): Unit = {
    println("Please practice in worksheets directory.")
    demo_exception()

    functionReturnUnit


    println("result of function returning Unit: %s".format(functionReturnUnit))
  }

  def demo_exception(): Unit = {
    val x = 100
    val y = 0

    var c:Int = 0;
    try {
      // Any File IO operation.
      val t = new FileReader("input.txt")
      // Start computing...
      c = x / y
      // other operation.
    }
    catch {
      case e: FileNotFoundException => println("Couldn't find that file.")
      case e: IOException => println("Had an IOException trying to read that file")
      case x: ArithmeticException => println("Exception: A number is not divisible by zero.")
      case x: RuntimeException => divide_raising_exception("Raised RuntimeException, cannot be divided by Zero!")
      case _: Throwable => println("Got some other kind of Throwable exception")
    } finally {
      println(" **************Job completed! ************")
    }

  }
  def divide_raising_exception(message: String): Nothing = throw new RuntimeException(message)


  // The null reference is used to represent an absent value, and Null with a capital ‘N’ is its type.
  // null 是个引用类型，表示一个空值， Null(首字母大写）， null 是 Null类型的， 就是说Null是null的类型。
  // Null Reference
  // Null is the value of a reference that is not referring to any object
  // 它可以用作所有引用类型的替代品——即所有扩展 scala.AnyRef 的类型。
  def null_demo(): Unit = {
    //Initializes an instance of Car with null reference
    val nullRefCar: Car = null
    try {
      println(nullRefCar.make)
    } catch {
      case npe: NullPointerException => println("Null Pointer Error occurred: %s".format(npe))
    }

    //Initializes an instance of Car type with argument as null
    val nullMakeCar = Car(null)
    println(nullMakeCar.make)

  }

  /**
   * Nil – the Empty List
   * Nil is an empty singleton object list that extends the List type,
   * therefore, it has all fields and methods that any other List object has,
   * and it’s usually used to initialize empty lists:
   */

  def Nil_demo(): Unit = {
    val myList = Nil
    println("a list is initialized with length %s".format(myList.length))

    // All List methods are applicable for Nil as well. Thus,
    // it can be used safely in place of any regular List.
    // A popular way of creating and populating new lists is using Nil and the cons (::) operator:
    val consList = "A" :: "B" :: Nil
  }

  /**
   * None – the Empty Option
   * None is a subtype of Option type. We’ve seen the problems caused
   * when functions return null values in case they don’t have any values to return.
   * may cause calling programs to crash if it doesn’t properly handle null.
   *
   * Scala’s best practices advise us to wrap the return value in the Option type
   * in cases where the function may not have a return value.
   *
   */

  val studentRegister: Map[Int, String] = Map(1 -> "John", 2 -> "Mary")

  def getStudentName(studentRegister: Map[Int, String], roll: Int): Option[String] = {
    studentRegister.get(roll)
  }

  def printStudent(student: Option[String]): Unit = {
    student match {
      case Some(str) => println("Student Name is %s".format(str))
      case None => println("No Student!!")
    }
  }

  /**
   * In case the roll number is not available in the register,
   * the function returns a None and the calling method can gracefully
   * handle the case of a missing record.
   */

  /*
  Unit – the Empty Return Type
  Unit is the return type of functions returning nothing. It’s equivalent to the void type in Java except for one difference: The Unit type in Scala has one singleton value that is (), but void in Java does not have any value:
  */
  def functionReturnUnit: Unit = {
    """
      do something, don't return anything
    """

    println("-------> do and no return ")
  }


  /*
  We’ll see an output printed in the console as “result of function returning Unit: ()”.

  If we omit the return type and the “=” operator in the function definition, the Scala compiler will implicitly convert it to a Unit return type:
  */

  //------------------------------------------------------------------------------------

  /*
  Nothing
  Nothing is the absolute “no value” type in Scala. It doesn’t have any methods or values.

  Any type is the root of the entire Scala type system, and Nothing extends the Any type. Therefore, we can use Nothing in place of any Scala type both reference types and value types.

  Nothing together with the Null type sits at the bottom of the type hierarchy.
  Therefore, it’s also a subtype of every other type in Scala — even the classes and traits we define.
  This property gives us a lot of advantages in situations such as defining a generic empty base class.
  Nil is such an example: Nil extends List[Nothing], thus allows it to be used with a List of any type,
  be it String, Int, or custom classes.
  */


  /*
     We can’t use Nothing as the return type of a function except in the case
     where the function throws an exception. This is because Nothing doesn’t have
     any value. One such use case is a function that logs an exception
     and throws another custom exception:
  */

  def logException(e: Exception): Nothing = {
    println("logging Exception: %s".format(e.getMessage))
    throw new Exception("My New Exception")
  }


}



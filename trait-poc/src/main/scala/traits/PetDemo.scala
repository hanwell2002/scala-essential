package traits


import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name: String
}

trait Singing {
  def sing
}



class Cat(val name: String) extends  Pet

class Dog(val name: String) extends Pet

class Bird(val name: String) extends Pet with Singing
{
  def sing = println("Bird is singing")
}
object PetDemo extends App {
  val dog = new Dog("Harry")
  val cat = new Cat("Sally")
  val lark = new Bird("Madona")

  lark.sing

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.append(lark)

  animals.foreach(pet => println(pet.name)) // Prints Harry Sally
}
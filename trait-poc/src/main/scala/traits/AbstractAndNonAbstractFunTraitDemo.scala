package traits


// Illustrate the concept of
// abstract and non-abstract method in Traits

// Trait with abstract and non-abstract methods
trait ReceptionTrait {
  // Abstract method
  def greeting;

  // Non-abstract method
  def tutorial {
    println("This is a tutorial of Traits in Scala")
  }
}


// MyClass inherits trait
class AbstractAndNonAbstractFunTraitDemo extends ReceptionTrait {

  // Implementation of abstract method
  // No need to implement a non-abstract
  // method because it already implemented
  def greeting() {
    println("Welcome to Microsoft Corp.")
  }

}

object Main extends App {
  val obj = new AbstractAndNonAbstractFunTraitDemo();
  obj.greeting
  obj.tutorial
}
package traits

/**
Animals can be divided into five distinct groups: (Vertebrate, Invertebrate)
mammals, fish, birds, reptiles, and amphibians.
 哺乳动物、鱼类、鸟类、爬行动物和两栖动物。
 */
trait Animal
{
  def pet
  def pet_color
}

// Dog inherits trait
class Alpaca extends Animal
{

  // Implementation of methods of Animal
  def pet()
  {
    println("Pet: Shih Tzu")
  }

  def pet_color()
  {
    println("Pet_color: White")
  }

  // Class method
  def pet_name()
  {
    println("Pet_name: Bean")
  }
}

object TraitDemo {

  // Main method
  def main(args: Array[String])
  {
    val obj = new Alpaca();
    obj.pet();
    obj.pet_color();
    obj.pet_name();
  }
}
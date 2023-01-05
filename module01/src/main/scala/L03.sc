/* Methods as operators */
val i1 = 10
val i2 = 30

val sum = i1 + i2
val anotherWaySum = i1.+(i2)

val multiply = i1 * i2
val divide = i2 / i1

val s = "Scala String!"
s indexOf 'a'
s indexOf('a', 3)

/* Prefix operators */
val negative = -100

/* Postfix Operators */
val toLong = 100 toLong

/* Create your own Prefix operator */
class Text(val string: String) {
  def unary_! = new Text(string + "!!")

  override def toString: String = string
}

val text = new Text("wow")
!text

text toString // example of Postfix operator




val list = List.empty

val list2 = List(1,3,4)

list = list :+ list2

val list3 = List(2,5,8)

list = list :+ =  list3
list = list ""+ list3;

val i = 0

i = i+1
i += 1

i = i +2
i += 2;







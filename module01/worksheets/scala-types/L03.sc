/* Methods as operators */
val i1 = 10
val i2 = 30

val l1 = 100L

val sum = i1 + i2

val anotherWaySum = i1.+(i2)

val multiply = i1 * i2
val divide = i2 / i1

val s = "Scala String!"
s indexOf 'a'
s indexOf('a',3)

val h = "hello, world"

/* Prefix operators */
val negative = -100

/* Postfix Operators */
val tl = 100 toLong

/* Create your own Prefix operator */
class Text(val string: String) {
  def unary_! = new Text(string + "!!")

  def unary_+ = new Text("##" + string)

  override def toString: String =  string
}


val text = new Text("wow")
!text
+text


text toString // example of Postfix operator


val commentTxt = new Text("Hello")

println(commentTxt)


val intVal1 = 100

val longVal2 = 200L

val l3 = intVal1 + longVal2

val doubleExample = 99.9

intVal1 + doubleExample



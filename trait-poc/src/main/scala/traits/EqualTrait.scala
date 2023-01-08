package traits

trait Equal {
  def isEqual(p: Any): Boolean
  def isNotEqual(p: Any): Boolean = !isEqual(p)
}



class Point(_x: Int, _y: Int) extends Equal {
  var x: Int = _x
  var y: Int = _y
  def isEqual(obj: Any) =
      obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x &&
      obj.asInstanceOf[Point].y == y
}

object Test extends App{
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)
    val p4 = new Point(2, 3)

    println(p1.isEqual(p4))
    println(p1.isEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
}

// && ==> and, ||, !

class Employee {
  var first: String = ""
  var last: String = ""

  override def toString:String = last + ", "+ first
}

var amyJones = new Employee
amyJones.first = "Amy"
amyJones.last = "Jones"

println(amyJones);


var bobMartin = new Employee
bobMartin.first = "Bob"
bobMartin.last = "Martin"

var taylorJackson = new Employee
taylorJackson.first = "Taylor"
taylorJackson.last = "Jackson"

amyJones.first = "jack"


println(amyJones);

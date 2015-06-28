object literals extends App {
  var i = 10

  println("i*i : "+ (i * i))
  println("i*i : "+ (i.*(i)))
  
  var max = 5  max 6
  println(max)
  
  var ceil = 5.4.ceil
  println(ceil)
  
  checkAny("one");
  checkAny(1);
  checkAny(1.0);

  def checkAny(ref: Any) {
    println(ref.isInstanceOf[String])
    println(ref)
  }
}
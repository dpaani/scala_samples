
object tuples extends App {

  var simpleTuple = "key" -> "value"
  
  println("tuple key: "+simpleTuple._1)
  println("tuple value: "+simpleTuple._2)
  
  var multiValue = ("1","2","3",4, 5.0);
  println(multiValue._5);
  
  
}
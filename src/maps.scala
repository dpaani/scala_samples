object maps extends App {

  var simpleMap = Map(("1","one"), ("2" -> "two"));
  println(simpleMap.mkString(","))
  
  simpleMap+=("3"->"three");
  
  println(simpleMap.mkString(","))
  
  println("keys -->"+simpleMap.keys.mkString(","));
  println("values -->"+simpleMap.values.mkString(","));
  
}
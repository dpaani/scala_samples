object sets extends App {

  var simpleSet = Set("java", "c", "c++", "scala", "scala")

  println("values: " + simpleSet.mkString("[", ",", "]"))

  simpleSet += "ruby"
  println("values: " + simpleSet.mkString("[", ",", "]"))

  println("contains: " + simpleSet.contains("ruby"))

  var tumpleSet = Set("1" -> "one", "2" -> "two")
  val map = tumpleSet.toMap
  map.foreach(myprintfn(_))

  def myprintfn(arg: (String, String)) = {
    println("key: "+arg._1)
    println("value: "+arg._2)
  }
  
}
object arrays {

  def main(args: Array[String]): Unit = {
    var languages = new Array[String](3);
    languages(0) = "java"
    languages(1) = "c"
    languages(2) = "c++"

    languages.foreach { language => println(language) }
    
    println("-------------")
    
    languages.foreach {println}
    
    println("-------------")
    
    languages.foreach {display}
  }
  
  def display(msg: String) : Unit = {
    println("printed using display method: "+msg)
  }
}
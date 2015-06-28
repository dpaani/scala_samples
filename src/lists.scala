

object lists {

  def main(args: Array[String]): Unit = {
    var languages = List[String]("java","c","c++")
    
    Console.println("first: "+languages(0))
    Console.println("head: "+languages.head)
    Console.println("tail: "+languages.tail)
    Console.println("take: "+languages.take(2).mkString(","))
    
    languages.foreach { language => println(language) }
    
    languages+("ddd")
    
    println("-------------")
    languages.foreach { language => println(language.toUpperCase) }
    println("-------------")

    var empty = List.empty;
    println(empty.mkString)
    
    println("-------------")

    var usingApply = List.apply("1","2","3");
    println(usingApply.mkString)
    println("-------------")

    var fill = List.fill(5)( true);
    println(fill.mkString(","))
    
    println("-------------")

    
//    var marks = List[BigInt]();
//    marks+=100
//    
//    marks.uapply(100);
//    marks.apply(200);
//
//
//    println(marks.mkString);

  }
  
 
}
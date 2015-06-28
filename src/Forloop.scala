object Forloop {

  def main(args: Array[String]): Unit = {

    // for loop 1
    for (i <- 1 to 10) {
      println(i)
    }

    println("------");
    var vector = for (i <- 1 to 5) yield i * 2;
    for (v <- vector) {
      println(v)
    }

    println("------");
    for (i <- 0 to 10 if (i % 2 == 0 && i != 0)) println(i)

  }
}
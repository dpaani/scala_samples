

/**
 * @author pani
 */
object ifstatement {

  def getValidValue(x: Int) = if (x < 0) 0 else x

  def main(args: Array[String]): Unit = {
    println(getValidValue(-11))
    println(getValidValue(10))

    var a: Int = 10;
    var b: Int = 20;
    var max: Int = 0;
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    println("max-->" + max)
    max = if (a > b) a else b;
    println("max-->" + max)
  }
}
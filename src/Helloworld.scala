/**
 * First hello scala ...
 *
 * This is simple scala singleton object only with main method.
 * @author pani
 */
object Helloworld {

  /**
   * Main method - entry point.
   *
   * Unit keyword says main method will not return any value
   */
  def main(args: Array[String]): Unit = {
    println("hello scala");

    var i = 2;
    i match {
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("three")
    }
  }
}
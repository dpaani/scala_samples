
/**
 * @author pani
 */
object matches {
  def main(args: Array[String]): Unit = {
    var i = 1;
    var ret = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "three"
    }
    
    println(ret);
  }
}
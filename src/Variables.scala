package Variables

/**
 * @author pani
 */
object Variables {
  
  def main(args: Array[String]): Unit = {
    val i:Int = 10;
    println("value of i is %d".format(i));
    
    var msg : String = null;
    msg = "world";
    println("hello "+msg)
    
    
    var flag: Boolean = true;
    
    println("flag: "+flag)
    
    
  }
}
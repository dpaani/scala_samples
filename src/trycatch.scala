

/**
 * @author pani
 */
class trycatch {

  def main(args: Array[String]): Unit = {
     try {
      var name: String = null
      println(name.toUpperCase())
    } catch {
      case t: Throwable => {
        println("got Throwable: " + t.getMessage())
      }
    }

  }
}
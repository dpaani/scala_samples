
/**
 * @author pani
 */
object scala {

  def factorialUsingRecursive(n: Int): Int = {
    if (n <= 1) {
      return n;
    }
    return n * factorialUsingRecursive(n - 1);
  }

  def factorial(n: Int): Int = {
    var factorial = 1;
    for (i <- 1 to n) {
      factorial *= i;
    }
    return factorial;
  }

  def main(args: Array[String]): Unit = {
    printf("Factorial of 10 is %d", factorial(10))
    printf("Factorial of 10 is %d", factorialUsingRecursive(10))
  }

}
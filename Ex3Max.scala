object Ex3Max {

  def max_of_two(x: Int, y: Int): Int = {
    return x.max(y)
  }

  def get_max() {
    print("Enter the first number: ")
    var number1 = scala.io.StdIn.readInt()
    print("Enter the second number: ")
    var number2 = scala.io.StdIn.readInt()
    println("The max of the two numbers is: "+ max_of_two(number1,number2))
  }

  def main(args:Array[String]): Unit =
  {
    get_max()
  }
}

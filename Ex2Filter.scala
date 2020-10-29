object Ex2Filter {

  def main(args:Array[String])
  {

    // Creating a list from 1 to 45
    val a = List.range(1, 45)

    // Sum - numbers divisible by 4
    val result = a.filter((x: Int) => x%4 == 0).sum

    // Sum - squares of the numbers divisible by 3 and less than 20
    val result2 = a.filter((x: Int) => x%3 == 0 && x < 20).map(x => x*x).sum

    // Displays output
    println("Sum of the numbers divisible by 4 = " + result)
    println("Sum of the squares of the numbers divisible by 3 and less than 20 = " + result2)

  }
}
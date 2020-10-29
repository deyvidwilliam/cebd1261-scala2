def cube(x: Int) = { x * x * x}

def factorial(x: List[Int]) : Int = {
  x.reduce((x: Int, y: Int) => x * y)
}

// List of integers (1-9)
val numbers = List(1,2,3,4,5,6,78,9)

// Removing even numbers
val numbers2 = numbers.filter((x: Int) => x%2 != 0)

//Mapping the cube function to filtered list
val numbers3 = numbers2.map(cube)

println(numbers2)
println(numbers3)
println(factorial(List(1,2,3,4)))




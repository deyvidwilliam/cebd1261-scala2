def frame(x: String, f: String => String): String = {
  f(x)
}

def greet1(x: String): String = {
  return "Hello " + x + ", How are you ding?"
}

def greet2(x: String): String = {
  return "Hello " + x + ", How was your day?"
}

println(frame("Alice",greet1));
println(frame("Nick",greet2));


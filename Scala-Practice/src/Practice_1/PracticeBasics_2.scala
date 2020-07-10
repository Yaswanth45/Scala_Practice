package Practice_1

object PracticeBasics_2 extends App{

  def parameterlessfunctin() : Int={
    42
  }
  println(parameterlessfunctin())

  def functionwithparam(x:Int):Int =x+43

  println(functionwithparam(34))

  def factorial(n : Int, acc : Int = 1) : Int = {
    if(n<1) acc
    else factorial(n-1,n*acc)
  }
  println(factorial(8))
  println(
    for(i <- 1 to 10 )yield factorial(i))
}

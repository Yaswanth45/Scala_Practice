package Practice_1

object Basics_part3 extends App{

  def greeetings(name:String,age:Int)=println(s"Hi, My name is $name and I am $age old.")

  greeetings("Yaswanth",23)

  //Fibonacci
  def fibonacci(v: Int):Int = {
    if (v<=2) 1
    else fibonacci(v-1)+fibonacci(v-2)
  }
  println(fibonacci(8))

  def isPrime(n : Int) : Boolean= {
    def isPrimeUntill(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntill(t - 1)
    }
    isPrimeUntill(n / 2)
  }
  println(isPrime(345))
  println(isPrime(3003))
  println(isPrime(3))
  println(isPrime(4598))

  val name = "Yaswanth"
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(1, 7))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)
  println(str.take(2))

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  val myths = f"$name can eat $speed%1.1f burgers per minute"
  println(myth)
  println(myths)
  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}

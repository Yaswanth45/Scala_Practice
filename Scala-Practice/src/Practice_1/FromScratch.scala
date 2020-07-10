package Practice_1

object FromScratch extends App{

  def callByValue(x: Long) : Unit={
    println("by Value :"+ 234567893L)
    println("by Value :"+ 497653920L)
  }
  def calledByName(x: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  callByValue(2345677L)
  calledByName(System.nanoTime())

  def infinite():Int=1+infinite()
  def printFirst(x:Int ,y: =>Int):Unit=println(x)

  println(printFirst(34,infinite()))

  //default args
  def trFact(x:Int,acc:Int=1):Int={
    if(x<1) acc
    else trFact(x-1,x*acc)
  }
  println(trFact(7,3))

  def savePicture(format: String = "jpg", height : Int = 1920, weight : Int = 1080) : Unit=println("Saving Picture")
  savePicture()
  savePicture(height=800)
  savePicture(weight=600,format="bmp",height=300)
  /**----------------------------------Expressions----------------------------------------------------*/
  println(2+3)
  println(2+4*8)
  val x=1+3
  println(1==x)

  println(!(1==x))

  var aVariable=4
//  aVariable += 3
//  println(aVariable)
//  aVariable -= 2
//  println(aVariable)
//  aVariable /= 4
//  println(aVariable)
//  aVariable *= 4
//  println(aVariable)

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }


  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)
  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}

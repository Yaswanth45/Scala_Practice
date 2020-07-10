package Practice_1

object Practice_Abstract extends App{

  abstract class Animal{
    def eat : Unit
    val creatureType : String = "Wild"
  }
  class Dog extends Animal{
     override val creatureType: String = "Pets"
     override def eat: Unit = println(s"$creatureType will eat both veg and Non-Veg")
  }

  class Crocdile extends Animal{
    override val creatureType: String = "Carnivore"

    override def eat: Unit = println(s"$creatureType will eat all")
    def eat(animal : Animal) : Unit = println(s"$creatureType will eat ${animal.creatureType}")
  }

  val german = new Dog
  val croc = new Crocdile
  german.eat
  croc.eat
  croc.eat(german)

  /**  traits  */

  trait Carnivore{
    def eat(animal : Animal) : Unit
    val creatureType : String = "Harm"
  }

  class Lion extends Animal with Carnivore{
    override val creatureType: String = "Wild"

    override def eat(animal: Animal): Unit = println(s"$creatureType is very dangerous than ${animal.creatureType}")

    override def eat: Unit = println("crunch crunch")
  }

  val lion = new Lion
  lion.eat
  lion.eat(croc)

  val monkey = new Animal {
    override def eat: Unit = println("I will eat like a human")
  }
  monkey.eat

}

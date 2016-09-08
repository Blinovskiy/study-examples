package scala_for_impatient.imp9_files_regex

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by User on 4/5/2016.
  */
object imp9_10 extends App {

  @SerialVersionUID(42L) class Person(val name: String) extends Serializable {
    val friends = new ArrayBuffer[Person]

    def addFriend(p: Person): Unit = {
      friends += p
    }

    def removeFriend(p: Person): Unit = {
      friends -= p
    }

    override def toString: String = name

  }

  val fred = new Person("Fred")
  val cristy = new Person("Cristy")
  val walter = new Person("Walter")
  fred.addFriend(cristy)
  fred.addFriend(walter)

  val out = new ObjectOutputStream(new FileOutputStream(".\\src\\worksheets\\imp9\\fred.obj"))
  out.writeObject(fred)
  out.close()
  println(fred)
  println(fred.friends)

  val in = new ObjectInputStream(new FileInputStream(".\\src\\worksheets\\imp9\\fred.obj"))
  val savedFred = in.readObject().asInstanceOf[Person]
  println(savedFred)
  println(fred.friends)

}

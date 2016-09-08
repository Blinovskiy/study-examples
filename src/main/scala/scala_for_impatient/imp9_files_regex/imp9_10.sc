import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala.collection.mutable.ArrayBuffer

@SerialVersionUID(42L) class Person(val name: String) extends Serializable {
  private val friends = new ArrayBuffer[Person]

  def addFriend(p: Person): Unit = {
    friends += p
  }

  def removeFriend(p: Person): Unit = {
    friends -= p
  }
}

val fred = new Person("Fred")

val out = new ObjectOutputStream(new FileOutputStream("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\fred.obj"))
out.writeObject(fred)
out.close()

val in = new ObjectInputStream(new FileInputStream("D:\\my_doc\\Dropbox\\Work\\Scala\\scala-examples\\src\\scala_for_impatient\\imp9_files_regex\\fred.obj"))
val savedFred = in.readObject().asInstanceOf[Person]
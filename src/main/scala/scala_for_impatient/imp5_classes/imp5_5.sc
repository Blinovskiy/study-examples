import scala.beans.BeanProperty

class Student(@BeanProperty val id: Long, @BeanProperty var name: String) {
}

val student = new Student(1,"First Student")
student.getId
student.getName
student.setName("New Name")
student.getName
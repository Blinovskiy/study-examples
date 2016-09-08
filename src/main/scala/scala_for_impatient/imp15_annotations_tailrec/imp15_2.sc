import scala.annotation.meta.{beanGetter, beanSetter, getter, setter}

//@Test(timeout = 100)
//def someTest() ={
//}

@deprecated @getter @setter @beanGetter @beanSetter
class dep1(@deprecated message: String = "", @deprecated since: String = "") extends annotation.StaticAnnotation {
  @deprecated val id = 0
}


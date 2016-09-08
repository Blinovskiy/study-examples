
"java.vm.vendor"
System.getProperty("java.vm.vendor")

val systemProperties = Map("java.runtime.name" -> System.getProperty("java.runtime.name"),
    "java.vm.version" -> System.getProperty("java.vm.version"),
    "sun.boot.library.path" -> System.getProperty("sun.boot.library.path"),
    "java.vm.vendor" -> System.getProperty("java.vm.vendor"),
    "java.vendor.url" -> System.getProperty("java.vendor.url"),
    "path.separator" -> System.getProperty("path.separator"),
    "java.vm.name" -> System.getProperty("java.vm.name")
   )

for((k, v) <- systemProperties) {
    println("%-25s| %s".format(k,v))
}
import scala.xml.Text

val node1 = <li>Fred</li> match { case <li>{Text((t))}</li> => t}

val node2 = <li>{"Fred"}</li> match { case <li>{Text((t))}</li> => t}
object NoBreakContinue extends App {
  var i = 0
  var foundIt = false
  while(i < args.length && !foundIt) {
    if(!args(i).startsWith("-")) {
      if (args(i).endsWith(".scala"))
        foundIt = true
    }
    i += 1
  }
  println(i)
  def searchFrom(j: Int): Int =
    if(j>= args.length) -1
    else if (args(j).startsWith("-")) searchFrom(j + 1)
    else if (args(j).endsWith(".scala")) j
    else searchFrom(j + 1)
  val j = searchFrom(0)
  println(j)
}

object FileList extends App {
  val filesHere = (new java.io.File("./src/main/scala")).listFiles

  for (file <- filesHere if file.getName.endsWith(".scala"))
    println(file)

  for (file <- filesHere)
    if(file.getName.endsWith(".scala"))
      println(file)

  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
  ) println(file)

  for (i <- 0 to 4)
    println("iterator" + i)

  for (i <- 0 until 4)
    println("iterator" + i)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file + ":" + line.trim)
  grep(".*gcd.*")

  def grep2(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ":" + trimmed)
  grep2(".*gcd.*")

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  val forLineLength =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length
}

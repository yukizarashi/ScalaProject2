import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object TryCatchSample extends App {
  val file = new FileReader("input.txt")
  try {
  } catch {
    case ex: FileNotFoundException =>
    case ex: IOException =>
  } finally {
    file.close()
  }
}
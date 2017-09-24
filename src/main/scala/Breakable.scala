import scala.util.control.Breaks._
import java.io._

object Breakable extends App {
  val in = new BufferedReader(new InputStreamReader(System.in))

  breakable {
    while (true) {
      println("? ")
      if(in.readLine() == "") break
    }
  }

}

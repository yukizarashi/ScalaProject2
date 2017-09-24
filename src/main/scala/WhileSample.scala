object WhileSample extends App{
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while(a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
  println(gcdLoop(36,44))
}

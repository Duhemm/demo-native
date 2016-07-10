import scalanative.native._, stdio._

object B {
  def main(args: Array[String]): Unit = {
    fprintf(stderr, c"Hello, native B!\n")
  }
}
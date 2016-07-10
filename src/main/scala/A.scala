import scalanative.native._, stdio._

object A {
  def main(args: Array[String]): Unit = {
    fprintf(stderr, c"Hello, native A!\n")
  }
}
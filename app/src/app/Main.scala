package app

object Main {
  def main(args: Array[String]): Unit = {
    println(hello(args.headOption.getOrElse("World")))
  }

  def hello(name: String): String = s"Hello, $name!"
}

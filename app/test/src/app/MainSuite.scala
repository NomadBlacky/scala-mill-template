package app

import munit.FunSuite

class MainSuite extends FunSuite {
  test("hello") {
    assertEquals(Main.hello("Scala"), "Hello, Scala!")
  }
}

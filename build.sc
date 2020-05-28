import mill._
import mill.eval.Evaluator
import mill.scalalib._
import mill.scalalib.scalafmt.ScalafmtModule

object app extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.13.2"
  // override def ivyDeps = Agg()

  object test extends Tests with ScalafmtModule {
    override def ivyDeps = Agg(ivy"org.scalameta::munit:0.7.7")
    def testFrameworks = Seq("munit.Framework")
  }
}

def idea(ev: Evaluator) = scalalib.GenIdea.idea(ev)

package tubi

package object common {
  def greet(who: String, what: String): Unit = {
    println(f"I am a ${who}'s ${what} with PySpark {pyspark.__version__}")
  }
}

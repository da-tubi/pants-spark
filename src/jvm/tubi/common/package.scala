package tubi

import org.apache.spark.sql.SparkSession

package object common {
  def greet(who: String, what: String): Unit = {
    val spark = SparkSession
      .builder()
      .master("local[1]")
      .appName("OnlyForVersion")
      .getOrCreate()
    println(s"I am a ${who}'s ${what} with Apache Spark ${spark.version}")
    spark.stop()
  }
}

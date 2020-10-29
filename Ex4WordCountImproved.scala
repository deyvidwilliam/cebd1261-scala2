import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object Ex4WordCountImproved {

  // Improve the wordCount example by
  //1. Remove the non-letter characters
  //2. Merge uppercase and lowercase words
  //3. Sort (descending) the pairs

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val session = SparkSession
      .builder
      .master("local[2]")
      .appName("wordCount")
      .getOrCreate()
    val input = session.read.textFile("C:/Temp/TheHungerGames.txt")

    import session.implicits._

    val words = input
      .flatMap(x => x.split(" ")
      .map(_.replaceAll("[^a-zA-Z]+",""))   // Remove the non-letter characters
      .map(_.toLowerCase()))                                  // Merge cases by converting all to lowercase (Ex.Remember x remember)

    val wordCounts = words.rdd.countByValue()

    import scala.collection.immutable.ListMap                //New list with sorted (descending) the pairs
    val sortedWordCounts = ListMap(wordCounts.toSeq.sortWith(_._2 > _._2):_*)
    sortedWordCounts.foreach(println)

  }
}

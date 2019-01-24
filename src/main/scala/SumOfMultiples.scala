import scala.collection.mutable.ListBuffer
object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {

    var range = 1 until limit
    val sum = range.filter( i => factors.exists( i % _ == 0)).sum

    sum
  }
}

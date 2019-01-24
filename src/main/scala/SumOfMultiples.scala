import scala.collection.mutable.ListBuffer
object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var sum = 0
    var range = new ListBuffer[Int]()
    var f = new ListBuffer[Int]()

    //make a range from 1 to limit
    for(i <- 1 to limit-1){
      range+= i
    }

    range.map { x=>
      if(!factors.isEmpty){
        if( x % factors.toList(0) == 0) {
          sum+=x
        }
        else if(factors.size > 1) {
          if(x % factors.toList(1) == 0){
            sum+=x
          }
          else if(factors.size > 2) {
            if(x % factors.toList(2) == 0 ){
              sum+=x
            }
          }
        }
        else{
          sum
        }
      }
    } 
    
    sum
    
  }
}

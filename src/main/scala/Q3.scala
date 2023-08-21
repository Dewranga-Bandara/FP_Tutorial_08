import scala.io.StdIn.readLine

object Q3 {
  private val toUpper: String => String = str => str.toUpperCase
  private val toLower: String => String = str => str.toLowerCase
  private val formatNames: (String, List[Int]) => String = (name, toUp) => {
    var str = ""
    var i = 0
    for (char <- name) {
      var flag = true
      for (n <- toUp) {
        if (i == n) {
          str += toUpper(char.toString)
          flag = false
        }
      }
      if(flag)
        str += char.toString
      i += 1
    }
    str
  }
  def main(args: Array[String]): Unit = {
    print("Enter your name: ")
    var input = readLine()
    print("Enter a list of indices of Upper Case letters separated by commas(None for -1): ")
    val inputLine = readLine()
    val indices = inputLine.split(",").map(_.toInt).toList
    input = input.toLowerCase

    if(indices.head == -1)
      println(f"Output: ${toLower(input)}")
    else
      println(f"Output: ${formatNames(input, indices)}")
  }
}

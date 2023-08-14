import scala.io.StdIn.readInt

object Q1 {
  private val calculateInterest: Double => Double = depositAmount => {
    if (depositAmount <= 20000) {
      depositAmount * 0.02
    } else if (depositAmount <= 200000) {
      depositAmount * 0.04
    } else if (depositAmount <= 2000000) {
      depositAmount * 0.035
    } else {
      depositAmount * 0.065
    }
  }
  def main(args: Array[String]): Unit = {
    print("Enter your deposit amount: Rs.")
    val deposit: Int = readInt()
    if (deposit <= 0) {
      System.err.println("Invalid amount")
      System.exit(1)
    }

    val interest = calculateInterest(deposit)
    val amount = deposit + interest
    println(s"After a year,  Deposit Amount: Rs.${"%.2f".format(amount)} & Actual Amount of Interest: Rs.${"%.2f".format(interest)}")

  }
}

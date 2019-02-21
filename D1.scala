package x

class D1 {

  def isCalled(cond: Boolean): Unit = {
    println("called")
    if(cond) {
      println("never called")
    }
  }

  def isNotCalled(): Unit = {
    println("I'm never called :(")
  }
}

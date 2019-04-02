package x

import org.scalatest._

class OtherTest extends FlatSpec {

  "testD1" should "work" in {
    new D1().isCalled(false)
  }

  "testB1" should "work" in {
    B1.calledByOtherTest()
  }

}

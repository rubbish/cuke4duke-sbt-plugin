import cuke4duke.{ ScalaDsl, EN }
import org.junit.Assert.assertEquals

class AddNumbersSteps extends ScalaDsl with EN {
  val adder = new Adder

  Given("first number is \"(\\d+)\"") { i: Int =>
    adder.firstNumber = i
  }


  Given("second number is \"(\\d+)\"") {i: Int =>
    adder.secondNumber = i
  }

  Then("the result should be \"(\\d+)\"") { expected: Int =>
    assertEquals(expected, adder.result)
  }
}

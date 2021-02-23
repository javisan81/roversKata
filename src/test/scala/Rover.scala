import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

abstract case class Direction()

object North extends Direction

case class Rover(x: Int, y: Int, direction: Direction) {
  def move(commands: Array[String]): Rover = {
    val firstCommand = commands(0)
    firstCommand match {
      case "f" => Rover(x, y + 1, North)
      case "b" => Rover(x, y - 1, North)
    }
  }
}

class RoverTest extends AnyFunSpec {
  describe("Rover") {
    it("rover is in position (0,0) facing north") {
      val rover = Rover(0, 0, North)
      rover shouldEqual Rover(0, 0, North)
    }

    it("rover moves forward facing north") {
      val rover = Rover(0, 0, North)
      rover.move(Array("f")) shouldEqual Rover(0, 1, North)
    }

    it("rover moves backward facing north") {
      val rover = Rover(0, 0, North)
      rover.move(Array("b")) shouldEqual Rover(0, -1, North)
    }

    it("rover moves forward facing north starting in (1,1)") {
      val rover = Rover(1, 1, North)
      rover.move(Array("f")) shouldEqual Rover(1, 2, North)
    }

    it("rover moves backward facing north starting in (1,1)") {
      val rover = Rover(1, 1, North)
      rover.move(Array("b")) shouldEqual Rover(1, 0, North)
    }

  }
}









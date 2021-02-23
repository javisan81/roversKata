import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

abstract case class Direction()
object North extends Direction
case class Rover(x: Int, y: Int, direction: Direction)

class RoverTest extends AnyFunSpec {
  describe("Rover") {
    it(s"rover is in position (0,0) facing north") {
      val rover = Rover(0,0, North)
      rover shouldEqual Rover(0,0, North)
    }
  }
}










import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class Rovers extends AnyFunSpec{
  describe("Rovers") {
    it("should be centered in 0,0 facing the north"){
      val rover = Rover(Position(0,0), North)
      rover.position shouldEqual Position(0,0)
      rover.direction shouldEqual North
    }
  }
}

case class Position(x: Int, y: Int)

abstract sealed case class Direction()
object North extends Direction

case class Rover(position: Position, direction: Direction) {
}
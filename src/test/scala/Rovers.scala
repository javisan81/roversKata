
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class Rovers extends AnyFunSpec{
  describe("Rovers") {
    it("should be centered in 0,0 facing the north"){
      val rover = Rover(Position(0,0), North)
      rover.position shouldEqual Position(0,0)
      rover.direction shouldEqual North
    }
    it("should be centered in 1,1 facing the south"){
      val rover = Rover(Position(1,1), South)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual South
    }
    it("should be centered in 1,1 facing the east"){
      val rover = Rover(Position(1,1), East)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual East
    }
    it("should be centered in 1,1 facing the west"){
      val rover = Rover(Position(1,1), West)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual West
    }
  }
}

case class Position(x: Int, y: Int)

abstract sealed case class Direction()
object North extends Direction
object South extends Direction
object East extends Direction
object West extends Direction

case class Rover(position: Position, direction: Direction) {
}
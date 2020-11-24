
import com.rovers
import com.rovers._
import com.rovers.Rover.move
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
      val rover = rovers.Rover(Position(1,1), South)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual South
    }
    it("should be centered in 1,1 facing the east"){
      val rover = rovers.Rover(Position(1,1), East)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual East
    }
    it("should be centered in 1,1 facing the west"){
      val rover = rovers.Rover(Position(1,1), West)
      rover.position shouldEqual Position(1,1)
      rover.direction shouldEqual West
    }
    it("should move 1 the rover to the north") {
      var rover =rovers.Rover(Position(0,0), North)
      rover =  move(rover, List(Forward))
      rover.position shouldEqual Position(0,1)
      rover.direction shouldEqual North
    }
    it("should move 1 the rover to the south") {
      var rover =rovers.Rover(Position(0,0), South)
      rover =  move(rover, List(Forward))
      rover.position shouldEqual Position(0,-1)
      rover.direction shouldEqual South
    }
  }
}









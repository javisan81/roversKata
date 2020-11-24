
import com.rovers
import com.rovers._
import com.rovers.Rover.move
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class Rovers extends AnyFunSpec {
  describe("Rovers") {
    it(s"should be centered in 0,0 facing the each direction") {
      List(North, South, East, West).foreach(dir => {
        val rover = Rover(Position(0, 0), dir)
        rover.position shouldEqual Position(0, 0)
        rover.direction shouldEqual dir
      })
    }

    it("should be centered in 1,1 facing the each direction") {
      List(North, South, East, West).foreach(dir => {
        val rover = Rover(Position(0, 0), dir)
        rover.position shouldEqual Position(0, 0)
        rover.direction shouldEqual dir
      })
    }

    it("should move forward the rover to each direction") {
      List((North, Position(0, 1)), (South, Position(0, -1)), (East, Position(1, 0)), (West, Position(-1, 0))).foreach(res => {
        var rover = rovers.Rover(Position(0, 0), res._1)
        rover = move(rover, List(Forward))
        rover.position shouldEqual res._2
        rover.direction shouldEqual res._1
      })
    }

  }

}









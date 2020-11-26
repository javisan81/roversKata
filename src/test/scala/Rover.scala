
import com.rovers
import com.rovers._
import com.rovers.Rover.move
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class Rover extends AnyFunSpec {
  describe("Rover") {
    it(s"should be centered in 0,0 facing each direction") {
      List(North, South, East, West).foreach(dir => {
        val rover = Rover(Position(0, 0), dir)
        rover.position shouldEqual Position(0, 0)
        rover.direction shouldEqual dir
      })
    }

    it("should be centered in 1,1 facing each direction") {
      List(North, South, East, West).foreach(dir => {
        val rover = Rover(Position(1, 1), dir)
        rover.position shouldEqual Position(1, 1)
        rover.direction shouldEqual dir
      })
    }
    it("should not move if the movement list is empty") {
      var rover = rovers.Rover(Position(0, 0), North)
      rover = move(rover, Nil)
      rover.position shouldEqual Position(0, 0)
      rover.direction shouldEqual North
    }

    it("should move forward the rover to each direction") {
      List((North, Position(0, 1)), (South, Position(0, -1)), (East, Position(1, 0)), (West, Position(-1, 0)))
        .foreach(res => {
          var rover = rovers.Rover(Position(0, 0), res._1)
          rover = move(rover, List(Forward))
          rover.position shouldEqual res._2
          rover.direction shouldEqual res._1
        })
    }

    it("should move backward the rover to each direction") {
      List((North, Position(0, -1)), (South, Position(0, 1)), (East, Position(-1, 0)), (West, Position(1, 0)))
        .foreach(res => {
          var rover = rovers.Rover(Position(0, 0), res._1)
          rover = move(rover, List(Backward))
          rover.position shouldEqual res._2
          rover.direction shouldEqual res._1
        })
    }

    it("should move backward and forwared the rover to each direction") {
      List(North, South, West, East)
        .foreach(direction => {
          var rover = rovers.Rover(Position(0, 0), direction)
          rover = move(rover, List(Backward, Forward))
          rover.position shouldEqual Position(0,0)
          rover.direction shouldEqual direction
        })
    }

    it("should move left the rover to each direction") {
      List((North, Position(-1, 0)), (South, Position(1, 0)), (East, Position(0, 1)), (West, Position(0, -1)))
        .foreach(res => {
          var rover = rovers.Rover(Position(0, 0), res._1)
          rover = move(rover, List(Left))
          rover.position shouldEqual res._2
          rover.direction shouldEqual res._1
        })
    }
    it("should move right the rover to each direction") {
      List((North, Position(1, 0)), (South, Position(-1, 0)), (East, Position(0, -1)), (West, Position(0, 1)))
        .foreach(res => {
          var rover = rovers.Rover(Position(0, 0), res._1)
          rover = move(rover, List(Right))
          rover.position shouldEqual res._2
          rover.direction shouldEqual res._1
        })
    }
  }
}









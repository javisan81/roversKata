package com.rovers

case class Rover(position: Position, direction: Direction)
object Rover {
   def move(rover: Rover, movement: List[Movement]): Rover = {
     rover match {
       case Rover(Position(x,y), North) => Rover(Position(x,y+1), North)
       case Rover(Position(x,y), South) => Rover(Position(x,y-1), South)
     }

  }
}

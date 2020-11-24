package com.rovers

case class Rover(position: Position, direction: Direction)
object Rover {
   def move(rover: Rover, movement: List[Movement]): Rover = {
     rover match {
       case Rover(_, North) => Rover(Position(0,1), North)
       case Rover(_, South) => Rover(Position(0,-1), South)
     }

  }
}

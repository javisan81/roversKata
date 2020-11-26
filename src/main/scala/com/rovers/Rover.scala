package com.rovers

case class Rover(position: Position, direction: Direction)

object Rover {

  def move(rover: Rover, movement: List[Movement]): Rover = {
    movement match {
      case Nil => rover
      case movement :: _ => movement.move(rover)
    }
  }

}

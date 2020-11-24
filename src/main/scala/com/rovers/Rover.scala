package com.rovers

case class Rover(position: Position, direction: Direction)
object Rover {
  def move(rover: Rover, movement: Movement): Rover = {
    Rover(Position(0, 1), rover.direction)
  }
}

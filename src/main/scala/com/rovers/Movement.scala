package com.rovers

sealed class Movement(vectorByDirection:Map[Direction, (Int,Int)]){
  def move(rover: Rover) = {
    Rover(traverse(rover.position, vectorByDirection.getOrElse(rover.direction, (0,0))), rover.direction)
  }
  private def traverse(point: Position, vector: (Int, Int)) = {
    Position(point.x + vector._1, point.y + vector._2)
  }
}
object Forward extends Movement(Map(North -> (0,1), South -> (0,-1), East -> (1,0), West -> (-1, 0)))
object Backward extends Movement(Map(North -> (0,-1), South -> (0,1), East -> (-1,0), West -> (1, 0)))
object Left extends Movement(Map(North -> (-1,0), South -> (1,0), East -> (0,1), West -> (0, -1)))
object Right extends Movement(Map(North -> (1,0), South -> (-1,0), East -> (0,-1), West -> (0, 1)))
package com.rovers

abstract sealed case class Direction()
object North extends Direction
object South extends Direction
object East extends Direction
object West extends Direction
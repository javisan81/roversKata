package com.rovers

sealed trait Movement
object Forward extends Movement
object Backward extends Movement
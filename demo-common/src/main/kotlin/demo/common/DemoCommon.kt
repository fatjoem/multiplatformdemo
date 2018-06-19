package demo.common

import dependency.DependencyCommon

class DemoCommon {

  private val dep = DependencyCommon()

  override fun toString(): String = "I am a common demo $dep"
}
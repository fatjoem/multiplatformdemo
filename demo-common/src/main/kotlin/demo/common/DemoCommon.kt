package demo.common

import dependency.DependencyCommon
import dependency.dependencyCommon

class DemoCommon {

  private val dep = DependencyCommon()

  override fun toString(): String = "I am a common demo $dep ${dependencyCommon()}"
}
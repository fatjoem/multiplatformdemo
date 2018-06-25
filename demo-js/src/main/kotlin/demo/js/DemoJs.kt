package demo.js

import dependency.DependencyCommon

class DemoJs {

  val dependencyCommon = DependencyCommon()

  override fun toString(): String {
    return "I am demojs and have a dependency: $dependencyCommon"
  }
}
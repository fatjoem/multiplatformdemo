package dependency

class DependencyCommon {
  override fun toString() = "I am a common dependency"
}

fun dependencyCommon() = "I am a toplevel function in common dependency."
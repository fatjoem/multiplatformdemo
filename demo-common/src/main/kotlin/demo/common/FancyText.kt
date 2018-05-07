package demo.common

/*
 * When enabling IntelliJ File | Settings | Build, Execution, Deployment | Compiler | Build project automatically,
 * then IntelliJ will complain with 'Error:(9, 35) Kotlin: Unresolved reference: String' in its 'Problems' tool window.
 *
 * However this file compiles successfully with gradle.
 */
class FancyText(private val text: String) {
  override fun toString() = "Fancy: $text"
}

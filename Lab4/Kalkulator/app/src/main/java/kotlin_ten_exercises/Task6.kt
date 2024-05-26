package kotlin_ten_exercises

/**
 * play.kotlinlang.org
 * Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
 */

class Task6 {
    fun main() {
        val button = "A"

        println(when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "P" -> "Menu"
            "S" -> "Nothing"
            else -> "There is no such button"
        })
    }
}
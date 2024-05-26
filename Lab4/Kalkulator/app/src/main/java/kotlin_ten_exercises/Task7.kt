package kotlin_ten_exercises

/**
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
 * - Use a while loop.
 * - Use a do-while loop.
 *
 * fun main() {
 *  var pizzaSlices = 0
 *  // Start refactoring here
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  println("There's only $pizzaSlices slice/s of pizza :(")
 *  pizzaSlices++
 *  // End refactoring here
 *  println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
 * }
 */

class Task7 {
    fun main() {
        // Using a while loop
        var pizzaSlices = 0

        while (pizzaSlices < 8) {
            pizzaSlices++
            if (pizzaSlices < 8) {
                println("There's only $pizzaSlices slice/s of pizza :(")
            } else {
                println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
            }
        }

        // Using a do-while loop
        pizzaSlices = 0

        do {
            pizzaSlices++
            if (pizzaSlices < 8) {
                println("There's only $pizzaSlices slice/s of pizza :(")
            } else {
                println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
            }
        } while (pizzaSlices < 8)
    }
}
package kotlin_ten_exercises

/**
 * play.kotlinlang.org
 * Write a program that simulates the Fizz buzz game.
 * Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz",
 * and any number divisible by five with the word "buzz".
 * Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
 */

class Task8 {
    fun main() {
        // Write your code here
        for (number in 1..100){
            if (number%3 == 0 && number%5 != 0){
                println("fizz")
            } else if (number%5==0 && number%3 !=0){
                println("buzz")
            } else if (number%5 == 0 && number%3 == 0){
                println("fizzbuzz")
            } else {
                println(number)
            }
        }
    }
}

/**
Example Results for numers in range 1 to 15:
 * 1
 * 2
 * fizz
 * 4
 * buzz
 * fizz
 * 7
 * 8
 * fizz
 * buzz
 * 11
 * fizz
 * 13
 * 14
 * fizzbuzz
 */
package grokking_algorithms

/**
 * Recursion is when a function calls itself.
 *
 * Every recursive function has two cases: the base case and the recursive case.
 *
 * A stack has two operations: push and pop.
 *
 * All function calls go onto the call stack.
 *
 * The call stack can get very large, which takes up a lot of memory.
 */

fun main() {
    val number = 5
    print("Factorial of $number is ${fact(number)}")
}

fun fact(number: Int): Int{
    return if(number == 1){
        1
    }else{
        //recursive call
        number * fact(number-1)
    }
}
package leet_code

import java.util.Scanner

//question 9

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter number - ")
    val number: Int = reader.nextInt()

    if(isPalindrome(number))
        println("Entered number ($number) is palindrome!")
    else
        print("Entered number ($number) is not palindrome")

}

fun isPalindrome(number: Int): Boolean {
    return number.toString().reversed() == number.toString()
}


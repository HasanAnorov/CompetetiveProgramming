package qudrat_abdurahimov

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter first real number - ")
    val firstNumber = reader.nextLong()
    print("Enter second real number - ")
    val secondNumber = reader.nextLong()
    print("Enter third real number - ")
    val thirdNumber = reader.nextLong()

    val isAscendingOrDescending = (firstNumber>secondNumber && secondNumber>thirdNumber) || (firstNumber<secondNumber && secondNumber<thirdNumber)
    if(isAscendingOrDescending){
        println("Numbers was:\n 1- $firstNumber \n 2- $secondNumber \n 3- $thirdNumber")
        println("And now they are:\n 1- ${firstNumber*2} \n 2- ${secondNumber*2} \n 3- ${thirdNumber*2}")
    }else{
        println("Numbers are:\n 1- $firstNumber \n 2- $secondNumber \n 3- $thirdNumber")
    }

}
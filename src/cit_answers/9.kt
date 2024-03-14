package cit_answers

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)

    print("A uchun x1 ni kiriting - ")
    val x1 = reader.nextInt()
    print("A uchun y1 ni kiriting - ")
    val y1 = reader.nextInt()

    print("B uchun x2 ni kiriting - ")
    val x2 = reader.nextInt()
    print("B uchun y2 ni kiriting - ")
    val y2 = reader.nextInt()

    print("C uchun x3 ni kiriting - ")
    val x3 = reader.nextInt()
    print("C uchun y3 ni kiriting - ")
    val y3 = reader.nextInt()

    val ab = sqrt((x2-x1).toDouble().pow(2)+(y2-y1).toDouble().pow(2))
    val ac = sqrt((x3-x1).toDouble().pow(2)+(y3-y1).toDouble().pow(2))
    val bc = sqrt((x3-x2).toDouble().pow(2)+(y3-y2).toDouble().pow(2))
    if (ab<ac+bc && bc<ac+ab && ac<ab+bc) print("Bular uchburchakning uchlarini tashkil qiladi")
    else println("Bular uchburchakning uchlarini tashkil qilmaydi")
}
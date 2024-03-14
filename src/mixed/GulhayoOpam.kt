package mixed

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    val balance = 430/5
    println("1 metr rux simining massasi - (430/5) - $balance")

    print("C meter miqdorini kiriting - ")
    val meter = input.nextInt()

    print("M g miqdorini kiriting - ")
    val massa = input.nextInt()

    if (meter*balance<=massa){
        println("Bu maqsad uchun $massa g massali sim $meter m ga sim o'tkazish uchun yetarli")
    }else{
        println("Bu maqsad uchun $massa g massali sim $meter m ga sim o'tkazish uchun yetarli emas")
    }

}
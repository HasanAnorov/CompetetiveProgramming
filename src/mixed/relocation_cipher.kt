package mixed

import java.util.*

fun main() {

    var sc = Scanner(System.`in`)
    var temp = true

    while (temp) {
        print("1> O'rniga qo'yish usulida shifrlas :\n" +
                "2> O'rin almashtirish usulida shifrlash :\n" +
                "3> Aralash shifrlash usulida shifrlash :\n" +
                "4> Chiqish \n" +
                "Enter here - ")
        when (sc.nextInt()) {
            1 -> {

                var encryptedWord = ""
                val schedule = mapOf(
                    'A' to 'B',
                    'B' to 'C',
                    'C' to 'D',
                    'D' to 'E',
                    'E' to 'F',
                    'F' to 'G',
                    'G' to 'H',
                    'H' to 'I',
                    'I' to 'J',
                    'J' to 'K',
                    'K' to 'L',
                    'L' to 'M',
                    'M' to 'N',
                    'N' to 'O',
                    'O' to 'P',
                    'P' to 'Q',
                    'Q' to 'R',
                    'R' to 'S',
                    'S' to 'T',
                    'T' to 'U',
                    'U' to 'V',
                    'V' to 'W',
                    'W' to 'X',
                    'X' to 'Y',
                    'Y' to 'Z',
                    'Z' to 'A'
                )
                sc = Scanner(System.`in`)
                print("Shifrlanadigan malumotni kiriting - ")
                val openWord = sc.nextLine().uppercase(Locale.getDefault())
                print("Ochiq so'z quyidagi jadval bo'yicha shifrlanadi :\n" +
                        "A\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ \n" +
                        "B\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ\tA \n")

                for(char in openWord){
                    for (map in schedule){
                        if(char == map.key){
                            //print(map.value)
                            encryptedWord += map.value.toString()
                        }
                    }
                }

                // val encryptionKey = openWord
                println("Shifrlangan so'z - ${encryptedWord.uppercase(Locale.getDefault())}")
                println(" ******** Jarayon yakunlandi ******** \n")

            }
            2 ->{
                val mixedIndices = mutableMapOf<Int,Int>()
                var encryptedWord = ""

                sc = Scanner(System.`in`)
                print("\nShifrlanadigan malumotni kiriting - ")
                val openWord = sc.nextLine().uppercase(Locale.getDefault()).trim()

                println("Almashuvlarni kiriting :")
                for (i in 0..<openWord.count()){
                    print("${openWord[i]} - ${i+1} -> ")
                    val comingIndex = sc.nextInt()
                    mixedIndices[i+1] = comingIndex
                }

                //println(mixedIndices)

                for (i in 0..<openWord.count()){
                    for (map in mixedIndices){
                        if (i+1 == map.value){
                            //print(openWord[map.key-1])
                            encryptedWord+=openWord[map.key-1]
                        }
                    }
                }

                println("Shifrlangan so'z - ${encryptedWord.uppercase(Locale.getDefault())}")
                println(" ******** Jarayon yakunlandi ******** \n")

            }
            3 ->{
                val mixedIndices = mutableMapOf<Int,Int>()
                var encryptedWordFirstCase = ""
                var encryptedWordFinalCase = ""

                val schedule = mapOf(
                    'A' to 'B',
                    'B' to 'C',
                    'C' to 'D',
                    'D' to 'E',
                    'E' to 'F',
                    'F' to 'G',
                    'G' to 'H',
                    'H' to 'I',
                    'I' to 'J',
                    'J' to 'K',
                    'K' to 'L',
                    'L' to 'M',
                    'M' to 'N',
                    'N' to 'O',
                    'O' to 'P',
                    'P' to 'Q',
                    'Q' to 'R',
                    'R' to 'S',
                    'S' to 'T',
                    'T' to 'U',
                    'U' to 'V',
                    'V' to 'W',
                    'W' to 'X',
                    'X' to 'Y',
                    'Y' to 'Z',
                    'Z' to 'A'
                )

                sc = Scanner(System.`in`)
                print("\nShifrlanadigan malumotni kiriting - ")
                val openWord = sc.nextLine().uppercase(Locale.getDefault()).trim()

                println("Almashuvlarni kiriting :")
                for (i in 0..<openWord.count()){
                    print("${openWord[i]} - ${i+1} -> ")
                    val comingIndex = sc.nextInt()
                    mixedIndices[i+1] = comingIndex
                }

                for (i in 0..<openWord.count()){
                    for (map in mixedIndices){
                        if (i+1 == map.value){
                            //print(openWord[map.key-1])
                            encryptedWordFirstCase+=openWord[map.key-1]
                        }
                    }
                }

                print("Ochiq so'z quyidagi jadval bo'yicha shifrlanadi :\n" +
                        "A\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ \n" +
                        "B\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ\tA \n")

                for(char in encryptedWordFirstCase){
                    for (map in schedule){
                        if(char == map.key){
                            //print(map.value)
                            encryptedWordFinalCase += map.value.toString()
                        }
                    }
                }

                println("\nShifrlangan so'z - ${encryptedWordFinalCase.uppercase(Locale.getDefault())}")
                println(" ******** Jarayon yakunlandi ******** \n")

            }
            4 -> {
                temp = false
            }
        }
    }
}
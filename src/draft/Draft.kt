package draft

import java.text.SimpleDateFormat
import java.util.*


fun main() {
//    val string = "user[1]"
//    val result = string.filter { it.isDigit() }
//    println(result)

//    val fileName = "Anorov Hasan.ext"
//    val extension = "(edit)."
//    val split = fileName.split(".")
//    var name = ""
//    val newList = split.toMutableList().apply {
//        add(split.size-1,extension)
//    }
//    newList.forEach {text ->
//        name += text
//        println(text)
//    }
//    println(name)

//    val dateFormat = SimpleDateFormat("yyyymmddhhmmss", Locale.getDefault())
//    val date: String = dateFormat.format(Date())
//
//    val current_data_time= SimpleDateFormat("MMMMddyyyyHHmm", Locale.getDefault())
//    val currentDateandTime: String = current_data_time.format(Date())

//    val calendar = Calendar.getInstance()
//
//    val currentHour = calendar[Calendar.HOUR_OF_DAY]
//    val currentMinute = calendar[Calendar.MINUTE]
//    val second = calendar[Calendar.SECOND]
//    val date = calendar[Calendar.DAY_OF_MONTH]
//    val month = calendar[Calendar.MONTH]
//    val year = calendar[Calendar.YEAR]
//
////    val hour = calendar.get(Calendar.HOUR_OF_DAY)
////    val minute = calendar.get(Calendar.MINUTE)
////    val second = calendar.get(Calendar.SECOND)
//    val currentTime = "$date/$month/$year-at-$currentHour:$currentMinute:$second "
//
//    val sdf = SimpleDateFormat("yyyy/MM/dd-HH:mm:ss")
//    val currentDateandTime = sdf.format(Date())

//    println(currentDateandTime)

//    println(0.5 + 0.1 === 0.6)
//    println(0.2 + 0.1 === 0.3)

//    val IP_ADDRESS_REGEX =
//        """^(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))\.(\d|[1-9]\d|1\d\d|2([0-4]\d|5[0-5]))$"""
//            .toRegex()
//
//    val isValid =IP_ADDRESS_REGEX.matches("192.168.19.1")
//    print(isValid)

//    println(getExtensionFromFilename("hello.txt"))
//    println(getExtensionFromFilename("hello.pdf"))
//    println(getExtensionFromFilename("hellosds.sdfsd.sdf.sdf.ppt"))
//    println(getExtensionFromFilename("hello.home"))
//    println(getExtensionFromFilename("hello"))
//    println(getExtensionFromFilename("hello sd.txt"))
//    println(getExtensionFromFilename("d$45fsd asd425w.bbf"))
//
//    println(getFileNameWithoutExtension("hello.txt"))
//    println(getFileNameWithoutExtension("hello.pdf"))
//    println(getFileNameWithoutExtension("hello.ppt"))
//    println(getFileNameWithoutExtension("hello.sfs.sdfs.dfs.home"))
//    println(getFileNameWithoutExtension("hello"))
//    println(getFileNameWithoutExtension("hello sd.txt"))
//    println(getFileNameWithoutExtension("d$45fsd asd425w.bbf"))
//    println(getFileNameWithoutExtension("d$45fsd asd425w(2112).bbf"))
//
//    println(generateUniqueFileName("download", "home sd", ".tct"))

//    val currentTime = Calendar.getInstance().time.toString()
    val calendar = Calendar.getInstance()
    val currentHour = calendar.get(Calendar.HOUR)
    val currentMinute = calendar.get(Calendar.MINUTE)
    val currentSecond = calendar.get(Calendar.SECOND)

    val currentDate = calendar.get(Calendar.DATE)
    //val currentMonth = calendar.get(Calendar.MONTH)
    val currentYear = calendar.get(Calendar.YEAR)
    val date = "${currentSecond}_${currentMinute}_${currentHour}"

    println(
        "date is $date"
    )

    val monthDate = SimpleDateFormat("MMM", Locale.getDefault())
    val currentShortMontName = monthDate.format(calendar.time)
    val currentTime = "$currentHour:$currentMinute:$currentSecond, $currentShortMontName $currentDate $currentYear"

    println(currentTime)
//
//    val timeX = LocalTime.now()
//    println(timeX)
//
//    println(currentTime)
//
//    val text = "/storage/emulated/0/Download/FastChat/gumanitar_blok(4).pdf"
//    println("unique name - $text.las")

//    val number = (5F/100)
//    println(number)

//    println(readableFileSize(1024))

//    val milliseconds = 64*1000L
//    println(
//        millisecondsToTime(milliseconds)
//    )

//    println(
//        getCurrentTime()
//    )

}

//fun getCurrentTime(): String {
//    val calendar = Calendar.getInstance()
//    return calendar.time.toString()
//}

//private fun millisecondsToTime(milliseconds: Long): String {
//    val minutes = (milliseconds / 1000) / 60
//    val seconds = (milliseconds / 1000) % 60
//    val secondsStr = seconds.toString()
//    val secs = if (secondsStr.length >= 2) {
//        secondsStr.substring(0, 2)
//    } else {
//        "0$secondsStr"
//    }
//
//    return "$minutes:$secs"
//}
//
//private fun getExtensionFromFilename(fileName:String):String{
//    return if (fileName.lastIndexOf(".") > 0) {
//        fileName.substringAfterLast(".")
//    } else {
//        ""
//    }
//}
//
//fun readableFileSize(size: Long): String {
//    if (size <= 0) return "0"
//    val units = arrayOf("B", "kB", "MB", "GB", "TB", "PB", "EB")
//    val digitGroups = (log10(size.toDouble()) / log10(1024.0)).toInt()
//    return DecimalFormat("#,##0.#").format(size / 1024.0.pow(digitGroups.toDouble())) + " " + units[digitGroups]
//}
//
//fun getFileNameWithoutExtension(fileName: String): String {
//    val lastDotIndex = fileName.lastIndexOf('.')
//    return if (lastDotIndex > 0) {
//        fileName.substring(0, lastDotIndex)
//    } else {
//        fileName // No extension found, return the original fileName
//    }
//}
//
//fun generateUniqueFileName(directory: String, baseFileName: String, extension: String): String {
//    var count = 0
//    var newFileName: String
//    val baseNameWithExtension = "$baseFileName.$extension"
//
//    do {
//        count++
//        newFileName = if (count == 1) {
//            "$directory/$baseNameWithExtension"
//        } else {
//            "$directory/$baseFileName($count).$extension"
//        }
//    } while (File(newFileName).exists())
//
//    return newFileName
//}
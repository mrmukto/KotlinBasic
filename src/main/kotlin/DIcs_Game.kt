import java.util.*

fun main() {
    var isGameOver = false
    val random = Random()
    val scanner = Scanner(System.`in`)
    println("Press enter to start rolling....")
    val newLine = scanner.nextLine()
    var d1 = random.nextInt(6) + 1
    var d2 = random.nextInt(6) + 1
    var sum = d1 + d2
    var target = 0
    println("$d1 $d2 -> $sum")
    if (sum == 7 || sum == 11) {
        println("You win!!!")
        isGameOver = true
    }else if (sum == 2 || sum == 3 || sum == 12) {
        println("You lost!!!")
        isGameOver = true
    }else {
        target = sum
        while (!isGameOver) {
            print("Press enter to roll again until you match $target")
            val newLine = scanner.nextLine()
            d1 = random.nextInt(6) + 1
            d2 = random.nextInt(6) + 1
            sum = d1 + d2

            println("$d1 $d2 -> $sum")
            if (sum == target) {
                println("You win!!!")
                isGameOver = true
            }else if (sum == 7){
                println("You lost!!!")
                isGameOver = true
            }
        }
    }
}
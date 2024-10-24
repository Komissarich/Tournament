import java.util.*
import kotlin.math.abs


fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите чере пробел характеристики мага (здоровье, силу атаки, имя, количество маны)")
    var info = scanner.nextLine().split(" ")
    val wizard = Wizard(info[0].toInt(), info[1].toInt(), info[2], info[3].toInt())

    println("Введите чере пробел характеристики робота (здоровье, силу атаки, имя,заряд батареи)")
    info = scanner.nextLine().split(" ")
    val robot = Robot(info[0].toInt(), info[1].toInt(), info[2], info[3].toInt())

    println("Введите чере пробел характеристики рыцаря (здоровье, силу атаки, имя, прочность брони)")
    info = scanner.nextLine().split(" ")
    val knight = Knight(info[0].toInt(), info[1].toInt(), info[2], info[3].toInt())

    while (knight.isDead() and robot.isDead() and wizard.isDead()) {
        println("Введите два числа через пробел, выбрав двух сражающихся в этом раунде. 1 - маг, 2 - робот, 3 - рыцарь")
        info = scanner.nextLine().split(" ")
        var attacker: Fighter? = null
        when (info[0]) {
            "1" -> {
                attacker = wizard
            }
            "2" -> {
                attacker = robot
            }
            "3" -> {
                attacker = knight
            }

        }

        var defender: Fighter? = null
        when {
            info[1] == "1" -> {
                defender = wizard
            }
            info[1] == "2" -> {
                defender = robot
            }
            info[1] == "3" -> {
                defender = knight
            }
        }
        if (defender == attacker) {
            println("Нельзя выбрать самого себя")
        }
        else {
            defender?.getDamage(attacker?.attack() ?: 0)
            attacker?.getDamage(defender?.attack() ?: 0)

        }
        println(wizard)
        println(robot)
        println(knight)
    }

}
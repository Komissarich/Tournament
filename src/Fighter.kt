abstract class Fighter(
    var health:Int,
    var attackValue:Int,
    var name:String
) {

    abstract fun attack():Int
    abstract fun getDamage(damage:Int)
    fun isDead():Boolean {
        return health > 0
    }

    override fun toString(): String {
        return "Имя: ${name} Здоровье: ${health} Сила атаки ${attackValue}"
    }
}
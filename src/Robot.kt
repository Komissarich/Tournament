class Robot(health:Int, attackValue:Int, name:String, var battery:Int):Fighter(health, attackValue, name) {
    override fun attack():Int {
        println("Заряд робота ${battery}, поэтому его атака равная изначально ${attackValue}, стала ${attackValue + battery + battery}")
        attackValue = attackValue + (battery * 2)
        battery /= 2
        return attackValue
    }

    override fun getDamage(damage: Int) {
        println("Робот ${name} получил ${damage} урона")
        health -= damage
    }
}
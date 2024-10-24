class Knight(health:Int, attackValue:Int, name:String, var armour:Int):Fighter(health, attackValue, name) {
    override fun attack():Int {
        return attackValue
    }

    override fun getDamage(damage: Int) {
        if (damage < armour){
            println("Броня рыцаря ${name} блокирует половину урона! ${name} получил ${damage / 2} урона")
            health = health - (damage / 2)
            armour -= damage
        }
        else {
            println("Броня рыцаря ${name} сломана, начинает чиниться. ${name} получил ${damage} урона")
            armour += 10
            health = health - damage
        }

    }


}
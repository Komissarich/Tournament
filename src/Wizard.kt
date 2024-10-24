import kotlin.random.Random

class Wizard(health:Int, attackValue:Int, name:String, var mana:Int):Fighter(health, attackValue, name) {

    override fun attack():Int{
        var castedSpell = Spells.values().random()
        if (mana > castedSpell.manaCost) {
            when (castedSpell) {
                Spells.Fireball -> {

                    attackValue *= 2
                    mana = mana / 2
                }

                Spells.Ice -> {
                    attackValue += 15
                    mana -= 10
                }

                Spells.WaterSplash -> {
                    attackValue += 5
                    mana -= 3
                }
            }
            println("Волшебник ${name} скастовал ${castedSpell}. Он наносит ${attackValue} урона")
        } else {
            println("Маны не хватает! Бьет на ${attackValue} урона")
        }

        return attackValue
    }

    override fun getDamage(damage:Int) {
        println("Волшебник ${name} получил ${damage} урона")
        health -= damage
    }




}
package com.ek.demo.strategy.model.character.behavior

class BowAndArrowBehavior : IWeaponBehavior {
    override fun useWeapon() {
        println("Bow shot")
    }
}
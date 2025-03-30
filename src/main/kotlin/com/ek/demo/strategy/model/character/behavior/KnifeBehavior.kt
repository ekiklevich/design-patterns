package com.ek.demo.strategy.model.character.behavior

class KnifeBehavior : IWeaponBehavior {
    override fun useWeapon() {
        println("Stab")
    }
}
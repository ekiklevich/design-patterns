package com.ek.demo.strategy.model.character.behavior

class SwordBehavior : IWeaponBehavior {
    override fun useWeapon() {
        println("Sword strike")
    }
}
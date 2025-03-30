package com.ek.demo.strategy.model.character.behavior

class AxeBehavior : IWeaponBehavior {
    override fun useWeapon() {
        println("Axe blow")
    }
}
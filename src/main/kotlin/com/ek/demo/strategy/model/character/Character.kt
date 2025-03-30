package com.ek.demo.strategy.model.character

import com.ek.demo.strategy.model.character.behavior.IWeaponBehavior

abstract class Character(private var weaponBehavior: IWeaponBehavior? = null) {

    fun fight() {
        if (weaponBehavior == null) {
            println("No weapon")
        } else {
            weaponBehavior!!.useWeapon()
        }
    }

    fun setWeapon(weaponBehavior: IWeaponBehavior) {
        this.weaponBehavior = weaponBehavior
    }
}
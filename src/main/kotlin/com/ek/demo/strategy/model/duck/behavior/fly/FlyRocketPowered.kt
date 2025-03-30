package com.ek.demo.strategy.model.duck.behavior.fly

class FlyRocketPowered : IFlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}
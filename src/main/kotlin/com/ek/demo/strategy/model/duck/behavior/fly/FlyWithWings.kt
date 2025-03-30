package com.ek.demo.strategy.model.duck.behavior.fly

class FlyWithWings : IFlyBehavior {
    override fun fly() {
        println("I'm flying")
    }
}
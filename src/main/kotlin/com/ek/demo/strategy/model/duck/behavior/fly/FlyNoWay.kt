package com.ek.demo.strategy.model.duck.behavior.fly

class FlyNoWay : IFlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}
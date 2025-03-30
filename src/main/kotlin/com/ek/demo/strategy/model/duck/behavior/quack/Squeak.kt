package com.ek.demo.strategy.model.duck.behavior.quack

class Squeak : IQuackBehavior {
    override fun quack() {
        println("Squeak")
    }
}
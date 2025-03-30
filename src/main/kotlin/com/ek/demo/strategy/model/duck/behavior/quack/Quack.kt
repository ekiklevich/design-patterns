package com.ek.demo.strategy.model.duck.behavior.quack

class Quack : IQuackBehavior {
    override fun quack() {
        println("Quack")
    }
}
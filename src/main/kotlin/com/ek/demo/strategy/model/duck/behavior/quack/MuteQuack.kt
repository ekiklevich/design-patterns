package com.ek.demo.strategy.model.duck.behavior.quack

class MuteQuack : IQuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}
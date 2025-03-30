package com.ek.demo.strategy.model.duck

import com.ek.demo.strategy.model.duck.behavior.fly.IFlyBehavior
import com.ek.demo.strategy.model.duck.behavior.quack.IQuackBehavior

abstract class Duck(
    var flyBehavior: IFlyBehavior,
    var quackBehavior: IQuackBehavior
) {
    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float")
    }
}
package com.ek.demo.strategy.model.duck

import com.ek.demo.strategy.model.duck.behavior.fly.FlyNoWay
import com.ek.demo.strategy.model.duck.behavior.quack.Quack

class ModelDuck : Duck(FlyNoWay(), Quack()) {
    override fun display() {
        println("I'm a model duck")
    }
}
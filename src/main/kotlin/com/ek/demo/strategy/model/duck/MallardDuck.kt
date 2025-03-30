package com.ek.demo.strategy.model.duck

import com.ek.demo.strategy.model.duck.behavior.fly.FlyWithWings
import com.ek.demo.strategy.model.duck.behavior.quack.Quack

class MallardDuck : Duck(FlyWithWings(), Quack()) {
    override fun display() {
        println("I'm a mallard duck")
    }
}
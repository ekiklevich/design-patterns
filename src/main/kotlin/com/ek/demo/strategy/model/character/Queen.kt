package com.ek.demo.strategy.model.character

import com.ek.demo.strategy.model.character.behavior.KnifeBehavior

class Queen : Character(KnifeBehavior()) {
}
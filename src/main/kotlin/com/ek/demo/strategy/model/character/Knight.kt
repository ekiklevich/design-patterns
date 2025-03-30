package com.ek.demo.strategy.model.character

import com.ek.demo.strategy.model.character.behavior.SwordBehavior

class Knight : Character(SwordBehavior()) {
}
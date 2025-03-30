package com.ek.demo.strategy

import com.ek.demo.strategy.model.character.Character
import com.ek.demo.strategy.model.character.King
import com.ek.demo.strategy.model.character.behavior.SwordBehavior
import com.ek.demo.strategy.model.duck.Duck
import com.ek.demo.strategy.model.duck.ModelDuck
import com.ek.demo.strategy.model.duck.behavior.fly.FlyRocketPowered
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@DisplayName("Паттерн: Стратегия")
class StrategyExampleTest {

    @Test
    @DisplayName("Утка")
    fun `duck strategy test`() {
        val duck: Duck = ModelDuck()
        duck.performFly()
        duck.flyBehavior = FlyRocketPowered()
        duck.performFly()
    }


    @Test
    @DisplayName("Персонаж")
    fun `character strategy test`() {
        val character: Character = King()
        character.fight()
        character.setWeapon(SwordBehavior())
        character.fight()
    }
}
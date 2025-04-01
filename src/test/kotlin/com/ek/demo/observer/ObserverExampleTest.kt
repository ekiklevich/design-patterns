package com.ek.demo.observer

import com.ek.demo.observer.weather.observer.CurrentConditionsDisplay
import com.ek.demo.observer.weather.observer.ForecastDisplay
import com.ek.demo.observer.weather.observer.StatisticsDisplay
import com.ek.demo.observer.weather.subject.WeatherData
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@DisplayName("Паттерн: Наблюдатель")
class ObserverExampleTest {

    @Test
    @DisplayName("Погода - экран с текущими погодными условиями")
    fun `current conditions display test`() {
        val weatherData = WeatherData()

        val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)

        for (i in 1..5) {
            Thread.sleep(1_000)
            weatherData.setMeasurements()
        }
    }

    @Test
    @DisplayName("Погода - экран со статистикой погодных условий")
    fun `statistics display test`() {
        val weatherData = WeatherData()

        val statisticsDisplay = StatisticsDisplay(weatherData)

        for (i in 1..5) {
            Thread.sleep(1_000)
            weatherData.setMeasurements()
        }
    }

    @Test
    @DisplayName("Погода - экран с прогнозом погодных условий")
    fun `forecast display test`() {
        val weatherData = WeatherData()

        val forecastDisplay = ForecastDisplay(weatherData)

        for (i in 1..5) {
            Thread.sleep(1_000)
            weatherData.setMeasurements()
        }
    }

    @Test
    @DisplayName("Погода - несколько экранов")
    fun `multiple display test`() {
        val weatherData = WeatherData()

        val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
        val statisticsDisplay = StatisticsDisplay(weatherData)
        val forecastDisplay = ForecastDisplay(weatherData)

        for (i in 1..5) {
            Thread.sleep(1_000)
            weatherData.setMeasurements()
        }
    }
}
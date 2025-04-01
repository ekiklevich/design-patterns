package com.ek.demo.observer.weather.observer

import com.ek.demo.observer.weather.subject.WeatherData

class ForecastDisplay(
    private val weatherData: WeatherData = WeatherData()
) : IWeatherObserver, IWeatherDisplay {
    private var currentPressure: Float = 29.92f
    private var lastPressure: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.getPressure()

        show()
    }

    override fun show() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}
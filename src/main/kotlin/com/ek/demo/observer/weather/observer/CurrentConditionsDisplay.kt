package com.ek.demo.observer.weather.observer

import com.ek.demo.observer.weather.subject.WeatherData

class CurrentConditionsDisplay(
    private var weatherData: WeatherData = WeatherData()
) : IWeatherObserver, IWeatherDisplay {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getHumidity()
        show()
    }

    override fun show() {
        println("Current conditions: %.1f F degrees and %.1f%% humidity".format(temperature, humidity))
    }
}
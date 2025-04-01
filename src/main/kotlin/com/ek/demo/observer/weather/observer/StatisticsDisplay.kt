package com.ek.demo.observer.weather.observer

import com.ek.demo.observer.weather.subject.WeatherData

class StatisticsDisplay(
    private var weatherData: WeatherData = WeatherData()
) : IWeatherObserver, IWeatherDisplay {
    private val temperatureList: MutableList<Float> = mutableListOf()

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        temperatureList.add(weatherData.getTemperature())
        show()
    }

    override fun show() {
        if (temperatureList.isNotEmpty()) {
            println(
                "Avg/Max/Min temperature = %.1f/%.1f/%.1f".format(
                    temperatureList.average(),
                    temperatureList.max(),
                    temperatureList.min()
                )
            )
        }
    }
}
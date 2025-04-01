package com.ek.demo.observer.weather.subject

import com.ek.demo.observer.weather.observer.IWeatherObserver
import kotlin.random.Random

class WeatherData(private val observers: MutableList<IWeatherObserver> = mutableListOf()) : ISubject {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun registerObserver(observer: IWeatherObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: IWeatherObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update()
        }
    }

    fun setMeasurements() {
        this.temperature = getTemperature()
        this.humidity = getHumidity()
        this.pressure = getPressure()
        measurementsChanged()
    }

    fun getTemperature(): Float {
        return Random.nextDouble(100.0, 200.0).toFloat()
    }

    fun getHumidity(): Float {
        return Random.nextDouble(0.0, 100.0).toFloat()
    }

    fun getPressure(): Float {
        return Random.nextDouble(50.0, 100.0).toFloat()
    }

    private fun measurementsChanged() {
        notifyObservers()
    }
}
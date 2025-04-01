package com.ek.demo.observer.weather.subject

import com.ek.demo.observer.weather.observer.IWeatherObserver

interface ISubject {
    fun registerObserver(observer: IWeatherObserver)

    fun removeObserver(observer: IWeatherObserver)

    fun notifyObservers()
}
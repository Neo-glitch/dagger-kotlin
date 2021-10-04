package com.neo.dagger2youtube

import javax.inject.Inject


class Remote {

    lateinit var car: Car


    @Inject
    constructor(){}

    fun provideCar(car: Car){
        println("providing car to Remote")
        this.car = car
    }
}
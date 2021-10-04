package com.neo.dagger2youtube

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity: Int

    @Inject  // passes the power capacity based on value passed in the PetrolEngine Module using Dagger
    constructor(@Named("power")powerCapacity: Int, @Named("engine")engineCapacity: Int){
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        println("Petrol engine started")
        println("Power Capacity is : $powerCapacity")
        println("Engine Capacity is : $engineCapacity")
    }
}
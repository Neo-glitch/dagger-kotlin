package com.neo.dagger2youtube

import javax.inject.Inject

class Car {
    @Inject
    lateinit var wheels: Wheels
    lateinit var engine: Engine

    lateinit var driver: Driver

    // injects the wheel and engine obj needed
//    @Inject
//    constructor(wheels: Wheels, engine: Engine){
//        this.wheels = wheels
//        this.engine = engine
//    }

    @Inject
    constructor(engine: Engine, driver: Driver){
        this.engine = engine
        this.driver = driver
    }

    fun start(){
        println("wheels$wheels")
        engine.start()
        println("driving")

        println("Driver: $driver")
    }


    @Inject  // injects the remote instance to this fun and runs the method in it
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }
}

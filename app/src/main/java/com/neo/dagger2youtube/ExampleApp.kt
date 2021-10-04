package com.neo.dagger2youtube

import android.app.Application


//AppLevel class
class ExampleApp: Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()

        carComponent = DaggerCarComponent.builder()
            .powerCapacity(300)
            .engineCapacity(500)
            .build()
    }

    // fun that ret same instance of this carComponent when need be
    fun carComponent(): CarComponent{
        return carComponent
    }

}
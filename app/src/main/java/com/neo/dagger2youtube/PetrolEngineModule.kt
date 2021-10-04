package com.neo.dagger2youtube

import dagger.Module
import dagger.Provides


// needed to pass an Engine interface as a param to inject constructor of Car
// tells dagger to use this module to create an Engine obj

@Module
class PetrolEngineModule {

//    var powerCapacity: Int

    // not needed since we gat an interface with a builder for passing args to this module
//    constructor(powerCapacity: Int){   // module that takes an arg when using with using the DaggerComponent
//        this.powerCapacity = powerCapacity
//    }


    // provides the Engine obj(petrolEngine with the params needed to get it)
//    @Provides
//    fun providesPetrolEngine(powerCapacity: Int, engineCapacity: Int) : Engine{
//        return PetrolEngine(powerCapacity, engineCapacity)
//    }

    @Provides // provides petrolEngine with the named params
    fun providesPetrolEngine(petrolEngine: PetrolEngine) : Engine{
        return petrolEngine
    }
}
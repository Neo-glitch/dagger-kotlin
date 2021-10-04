package com.neo.dagger2youtube

import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims{
        println("Rims object")
        return Rims()
    }


    @Provides
    fun provideTires(): Tires{
        println("Trees object")
        return Tires()
    }


    @Provides
    fun ProvideWheels(rims: Rims, tires: Tires): Wheels{
        // since provide fun to get rums and tires already,
        // dagger uses this to get the rims and tires obj in the provide function
        return Wheels(rims, tires)
    }
}
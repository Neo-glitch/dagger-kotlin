package com.neo.dagger2youtube

import dagger.Binds
import dagger.Module
import dagger.Provides


// altway and shoter way for creating a module
@Module
class DieselEngineModule {

    // provides EngineObj(DieselEngine)
    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}
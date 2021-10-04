package com.neo.dagger2youtube

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton


@Singleton
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])  // module needed is passed to get engine obj
interface CarComponent {
    // fun that returns a car obj that has it's dependency injected
    fun getCar(): Car

    // tells dagger to work on inject var in this class(MainActivity) as normal
    fun inject(mainActivity: MainActivity)


    // needed for alt way of passing powerCapacity value to dagger
    @Component.Builder
    interface Builder{

        @BindsInstance
        fun powerCapacity(@Named("power")powerCapacity: Int): Builder  // fun to pass value for powerCapacity

        @BindsInstance
        fun engineCapacity(@Named("engine")engineCapacity: Int): Builder

        fun build(): CarComponent   // ret a car component after passing the powerCapacity
    }
}
package com.neo.dagger2youtube

import javax.inject.Inject

interface Engine {

    // enables dagger to create a obj in a constructor that needs instance of this class

    fun start()
}
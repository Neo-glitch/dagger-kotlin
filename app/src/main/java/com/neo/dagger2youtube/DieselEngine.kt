package com.neo.dagger2youtube

import javax.inject.Inject

class DieselEngine: Engine {

    @Inject
    constructor()

    override fun start() {
        println("Diesel engine started")
    }
}
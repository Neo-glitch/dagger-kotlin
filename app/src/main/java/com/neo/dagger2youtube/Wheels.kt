package com.neo.dagger2youtube

import javax.inject.Inject

class Wheels {

    lateinit var rims:Rims
    lateinit var tires: Tires

    // enables dagger to create a obj in a constructor that needs instance of this class
//    @Inject(not used for 3rd party class(class subclassing another class)
    constructor(rims: Rims, tires: Tires){
        this.rims = rims
        this.tires = tires
    }
}
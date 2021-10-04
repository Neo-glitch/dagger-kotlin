package com.neo.dagger2youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dagger way of passing value to a module using in a component
//        var carComponent = DaggerCarComponent
//                .builder()
//                .petrolEngineModule(PetrolEngineModule(300))  // passes the powerCapacity to the PEngineModule
//                .build()

//        var carComponent = DaggerCarComponent.builder()
//            .powerCapacity(300)
//            .engineCapacity(500)
//            .build()

        // to get sameInstance of car component even if the activity is destroyed due to screen Orientation
        var carComponent = (application as ExampleApp).carComponent

        // inject all inject var in this class, since this class is create by android and not Dagger
        carComponent.inject(this)

        car.start()
        car1.start()
    }
}
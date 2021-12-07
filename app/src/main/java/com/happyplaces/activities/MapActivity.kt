package com.happyplaces.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.OnMapReadyCallback
import com.happyplaces.R
import kotlinx.android.synthetic.main.item_happy_place.view.*
/**
 * https://www.raywenderlich.com/230-introduction-to-google-maps-api-for-android-with-kotlin
 */
class MapActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)

        // This is used to align the xml view to this class
        setContentView(R.layout.activity_add_happy_place)
    }
}

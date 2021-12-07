package com.happyplaces.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.happyplaces.R
import kotlinx.android.synthetic.main.item_happy_place.view.*

class AddHappyPlaceActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)

        // This is used to align the xml view to this class
        setContentView(R.layout.activity_add_happy_place)
    }
}

 package com.example.locationbasics

import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

 class MainActivity : AppCompatActivity(),LocationListener {
    private lateinit var locationManager: LocationManager
    private lateinit var tvOutput : TextView
    private val locationPermissionCode=2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onLocationChanged(p0: Location) {
        TODO("Not yet implemented")
    }
}
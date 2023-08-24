 package com.example.locationbasics


 import android.Manifest
import android.content.Context
 import android.content.pm.PackageManager
 import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
 import androidx.core.app.ActivityCompat
 import androidx.core.content.ContextCompat


 class MainActivity : AppCompatActivity(),LocationListener {
    private lateinit var locationManager: LocationManager
    private lateinit var tvOutput : TextView
    private val locationPermissionCode=2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnLocations)
        button.setOnClickListener{
            getLocation()
        }
    }
    private fun getLocation(){
        locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
       if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) !=PackageManager.PERMISSION_GRANTED)
       {
           ActivityCompat.requestPermissions(this, arrayof(Manifest.permission.ACCESS_FINE_LOCATION),locationPermissionCode)
       }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000,5f,this)
    }

     private fun arrayof(accessFineLocation: String): Array<String> {

     }

     override fun onLocationChanged(p0: Location) {
        TODO("Not yet implemented")
    }
}
package com.sumirah.siwinbonebolango.main

import android.Manifest
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.widget.Toast
import com.sumirah.siwinbonebolango.R
import com.sumirah.siwinbonebolango.fragment.HomeFragment
import com.sumirah.siwinbonebolango.fragment.SpbeFragment
import com.sumirah.siwinbonebolango.fragment.ProfilFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//Membuat Toolbar / Header
//    setSupportActionBar(logoAtas)
//    tool_bar.setNavigationIcon(R.mipmap.ic_launcher)
//    this.title = "Si Win Bonebolango"


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.navigation_home -> {
//                Toast.makeText(this,"Halaman Home", Toast.LENGTH_LONG).show()
                fragment = HomeFragment()
            }
            R.id.navigation_spbe -> {
//                Toast.makeText(this,"Halaman SPBE", Toast.LENGTH_LONG).show()
                fragment = SpbeFragment()
            }
            R.id.navigation_tentang -> {
//                Toast.makeText(this, "Halaman Tentang", Toast.LENGTH_LONG).show()
                fragment = ProfilFragment()
            }
        }
        loadFragment(fragment)
    }


    private fun loadFragment(fragment: Fragment?): Boolean {
        fragment?.let {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
            return true
        }
        return false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set Image Logo Home
//        Glide.with(this).load(R.drawable.logo).into(logo_home)


        btn_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        loadFragment(HomeFragment())
//        Toast.makeText(this, "Halaman Utama", Toast.LENGTH_LONG).show()

    }

    //For Android 6+
    companion object {
        val MESSAGE_PROGRESS = "message_progress"
    }

    private val PERMISSION_REQUEST_CODE = 1


    private fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(this,
            Manifest.permission.WRITE_EXTERNAL_STORAGE)
        return if (result == PackageManager.PERMISSION_GRANTED) {
            true
        } else {
            false
        }
    }


    private fun requestPermission() {

        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), PERMISSION_REQUEST_CODE)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSION_REQUEST_CODE -> if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(this, "Permission Granted", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Permission Denied, Please allow to proceed !", Toast.LENGTH_LONG).show()
            }
        }
    }

}

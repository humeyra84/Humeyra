package com.example.humeyra

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            onBackPressedMethod()
        }
    }

    private fun onBackPressedMethod() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)

        } else {
            finish()
        }
    }

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawerlayout)

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        ///Default Navigation bar Tab Selected
        replaceFragment(NVHomeFragment())
        navigationView.setCheckedItem(R.id.nav_home)

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.navFragment, fragment)
            .commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.nav_market -> {
                replaceFragment(NVMarketFragment())
                title = "Market"
            }

            R.id.nav_appliances -> {
                replaceFragment(NVAppliancesFragment())
                title = "Appliances"
            }

            R.id.nav_cosmetic -> {
                replaceFragment(NVCosmeticFragment())
                title = "Cosmetic"
            }

            R.id.nav_fashion -> {
                replaceFragment(NVFashionFragment())
                title = "Fashion"
            }

            R.id.nav_health -> {
                replaceFragment(NVHealthFragment())
                title = "Health"
            }

            R.id.nav_home -> {
                replaceFragment(NVHomeFragment())
            }

            R.id.nav_like -> {
                replaceFragment(NVLikeFragment())
                Toast.makeText(this, "Like Clicked", Toast.LENGTH_LONG).show()
            }

            R.id.nav_logout -> {
                replaceFragment(NVLogoutFragment())
                Toast.makeText(this, "Logout Clicked", Toast.LENGTH_LONG).show()
            }

            R.id.nav_mail -> {
                replaceFragment(NVMailFragment())
                Toast.makeText(this, "Mail Clicked", Toast.LENGTH_LONG).show()
            }

            R.id.nav_office -> {
                replaceFragment(NVOfficeFragment())
                title = "Office"
            }

            R.id.nav_pets -> {
                replaceFragment(NVPetShopFragment())
                title = "PetShop"
            }

            R.id.nav_share -> {
                replaceFragment(NVShareFragment())
                Toast.makeText(this, "Share Clicked", Toast.LENGTH_LONG).show()
            }

            R.id.nav_technologie -> {
                replaceFragment(NVTechnologieFragment())
                title = "Technologie"
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true

    }
}







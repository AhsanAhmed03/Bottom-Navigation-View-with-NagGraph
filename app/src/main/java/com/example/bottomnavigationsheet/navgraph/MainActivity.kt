package com.example.bottomnavigationsheet.navgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation_view)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragmnet) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupWithNavController(
            bottomNavigationView,navController
        )

        bottomNavigationView.setOnNavigationItemSelectedListener {item ->
            when(item.itemId) {
                R.id.home_fragment -> {

                    navController.navigate(R.id.home_fragment)
                    true
                }

                R.id.personal_fragment -> {
                    navController.navigate(R.id.personal_fragment)
                    true
                }

                R.id.settings_fragment -> {
                    navController.navigate(R.id.settings_fragment)
                    true
                }
                else -> false
            }
        }

    }
}
package com.mdlicht.navpractice

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mdlicht.navpractice.databinding.ActivityMainBinding

class MainActivity : DataBindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setViews()
    }

    private fun setViews() {
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment? ?: return
        val navController = host.navController

        binding.toolbar.setupWithNavController(navController)
        binding.bottomNav.setupWithNavController(navController)
    }
}
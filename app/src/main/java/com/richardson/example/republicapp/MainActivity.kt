package com.richardson.example.republicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import com.richardson.example.republicapp.request.items.ResultItem
import com.richardson.example.republicapp.views.HomeFragment
import com.richardson.example.republicapp.views.StartupFragment

class MainActivity : AppCompatActivity(), StartupFragment.StartUpCallbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

    }

    //    StartUpCallbacks
    override fun startUpComplete(resultItem: ResultItem?) {
        if(resultItem == null) {
            findViewById<FragmentContainerView>(R.id.nav_host_fragment).findNavController().
            navigate(R.id.action_startupFragment_to_appUnavailable)
        } else {
            findViewById<FragmentContainerView>(R.id.nav_host_fragment).findNavController()
                .navigate(R.id.action_startupFragment_to_homeFragment)
        }
    }
}
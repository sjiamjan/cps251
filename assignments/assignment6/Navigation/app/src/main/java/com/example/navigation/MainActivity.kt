package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation.ui.main.MainFragment
import android.net.Uri
class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onFragmentInteraction(uri: Uri) {

    }
}
package com.example.mymvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymvvmexample.databinding.ActivityMainBinding

/*
*  This is a view we don't put code here if we can avoid it
*  use viewbinding instead.
*  viewbinding also us to abstract the view from logic
*  model -> viewmodel -> view
*  web response or database (model) -> logic to make data viewable (viewmodel) ->  semantics of a activity / fragment (view)
*
 */

class MainActivity : AppCompatActivity() {

    // binding class generated for binding is determined by layout name
    // IE: activity_main.xml -> ActivityMainBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

}
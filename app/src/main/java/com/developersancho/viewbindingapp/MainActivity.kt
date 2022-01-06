package com.developersancho.viewbindingapp

import android.os.Bundle
import com.developersancho.viewbindingapp.binding.BindingActivity
import com.developersancho.viewbindingapp.databinding.ActivityMainBinding

class MainActivity : BindingActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvName.text = getString(R.string.app_name)
    }

}
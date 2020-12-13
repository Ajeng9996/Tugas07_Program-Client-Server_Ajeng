package com.appsgm.app.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appsgm.app.R
import com.appsgm.app.data.model.AuthUser
import com.appsgm.app.databinding.ActivityMainBinding

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)

    }
    fun onSuccess(user: AuthUser) {}
}
package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger.models.Users
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var user : Users



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        (application as MyApplication).daggerUserComponent?.inject(this)
        init()
    }

    private fun init() {
        user.age = "login age"
        user.name = "login name"
        Log.d("abc", "Login Activity ${user.age + user.name}")

    }
}
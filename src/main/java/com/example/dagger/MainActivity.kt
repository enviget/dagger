package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger.models.Users
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user : Users
    @Inject
    lateinit var message : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).daggerUserComponent?.inject(this)
        init()
    }

    private fun init() {
//        var user = Users(name = "", age = "", email = "")
        user.age
        Log.d("abc", "${user.age}")

        message
        Log.d("abc", "$message")
    }
}
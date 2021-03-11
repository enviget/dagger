package com.example.dagger

import android.app.Application
import com.example.dagger.di.component.DaggerUserComponent
import com.example.dagger.di.component.UserComponent
import com.example.dagger.di.modules.UserModule

class MyApplication : Application(){

    var daggerUserComponent : UserComponent? = null

    override fun onCreate() {
        super.onCreate()
        daggerUserComponent = DaggerUserComponent.builder().userModule(UserModule()).build()

    }
}
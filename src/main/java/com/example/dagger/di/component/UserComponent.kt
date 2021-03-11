package com.example.dagger.di.component

import com.example.dagger.LoginActivity
import com.example.dagger.MainActivity
import com.example.dagger.di.modules.UserModule
import dagger.Component
import dagger.Module

@Component(modules = arrayOf(UserModule::class))
interface UserComponent {

    fun inject(activity: MainActivity)

    fun inject(activity : LoginActivity)
}
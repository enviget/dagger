package com.example.dagger.di.modules

import com.example.dagger.models.Users
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun providesUser() : Users{
        var user = Users("name", "age", "email@gmail.com", "password")
        return user
    }

    @Provides
    fun messageUser():String{
        return "message"
    }


}
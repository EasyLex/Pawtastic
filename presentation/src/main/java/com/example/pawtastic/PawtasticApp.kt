package com.example.pawtastic

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.pawtastic.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PawtasticApp : Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@PawtasticApp)
            modules(listOf(presentationModule, domainModule, dataModule))//get all the module and start the dependency injection
        }
    }
}
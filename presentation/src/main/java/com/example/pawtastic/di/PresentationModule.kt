package com.example.pawtastic.di

import org.koin.dsl.module

val presentationModule = module {
    includes(viewModelModule)
}
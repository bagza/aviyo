package ru.avito.api

import dagger.Module
import dagger.Provides


@Module
open class MyModule(private val valueToInject: String) {
    @Provides open fun provideFancyClass(): FancyClass = FancyClassImpl(valueToInject)
}
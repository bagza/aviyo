package ru.avito.api

import dagger.Component


@Component(modules = arrayOf(MyModule::class))
interface TryComponent {
    //fun inject(injectee: InjectedClassImpl)
    fun provideInject(): InjectedClassImpl
}
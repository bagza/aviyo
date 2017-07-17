package ru.avito.api

import javax.inject.Inject


interface InjectedClass {
    val injectedValue: String
}

class InjectedClassImpl @Inject constructor(var dependency: FancyClass) : InjectedClass {

    //@Inject lateinit var dependency: FancyClass

    /*val component: TryComponent by lazy {
        DaggerTryComponent
                .builder()
                .myModule(MyModule())
                .build()
    }

    init {
        component.inject(this)
    }*/

    override val injectedValue: String = "${dependency.value} is injected"
}
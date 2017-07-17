package ru.avito.api

import dagger.Component

@Component(modules = arrayOf(MyModule::class))
interface TestComponent {
    //fun inject(injectee: InjectedClassImpl)
    fun provideInject(): InjectedClassImpl
    fun inject(javaTest: PlainJavaUnitTest)
    fun inject(kotlinTest: DaggerInjectionKotlinTest)
    fun inject(groovyTest: StupidInjectStub)
}
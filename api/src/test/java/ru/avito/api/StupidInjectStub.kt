package ru.avito.api

import javax.inject.Inject


//NO way to inject directly any groovy class, because they are unavailable when kotlin kapt works.
//Didn't look for any workarounds, can't see any reasons for that: Injecting test script classes is a bad idea itself.
class StupidInjectStub {

    @Inject lateinit var injected: InjectedClassImpl

}
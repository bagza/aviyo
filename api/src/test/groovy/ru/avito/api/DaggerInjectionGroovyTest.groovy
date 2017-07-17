package ru.avito.api

import org.junit.Before
import org.junit.Test
import spock.lang.Shared
import spock.lang.Specification

import javax.inject.Inject


class DaggerInjectionGroovyTest extends Specification {

    def stub = new StupidInjectStub()

    def debugValue = "debugValue"

    def setup() {
        DaggerTestComponent.builder()
                .myModule(new MyModule(debugValue))
                .build()
                .inject(stub)
    }

    def "first feature method"() {
        expect:
        stub.injected.dependency.value == debugValue
    }

}

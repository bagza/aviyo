package ru.avito.api

import it.cosenonjaviste.daggermock.DaggerMockRule
import it.cosenonjaviste.daggermock.InjectFromComponent
import org.junit.Rule
import org.junit.Test
import spock.lang.Shared
import spock.lang.Specification


class DaggerMockGroovyTest extends Specification {

    def debugValue = "debugValue"
    def mockRuleReplace = "i was replaced by daggermock!"
    @Rule DaggerMockRule<TryComponent> rule = new DaggerMockRule<TryComponent>(TryComponent.class, new MyModule(debugValue))

    FancyClass testDependency = new FancyClassImpl(mockRuleReplace)

    @InjectFromComponent InjectedClassImpl injected

    def "first feature method"() {
        expect:
        injected.dependency.value == mockRuleReplace
    }

}

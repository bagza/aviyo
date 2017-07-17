package ru.avito.api

import com.nhaarman.mockito_kotlin.eq
import it.cosenonjaviste.daggermock.DaggerMockRule
import it.cosenonjaviste.daggermock.InjectFromComponent
import org.hamcrest.core.Is
import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Rule
import org.junit.Test


class DaggerMockKotlinTest {

    val debugValue = "debugValue"
    val replacedValue = "I was replaced!"
    @get:Rule val rule = DaggerMockRule<TryComponent>(TryComponent::class.java, MyModule(debugValue))

    val testDependency: FancyClass = FancyClassImpl(replacedValue)

    @InjectFromComponent lateinit var injected: InjectedClassImpl

    @Test fun daggerMock_injects_with_replacing() {
        assertThat(injected.dependency.value, `is`(replacedValue))
    }

}
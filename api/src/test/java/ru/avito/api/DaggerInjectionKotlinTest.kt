package ru.avito.api

import org.hamcrest.core.Is
import org.hamcrest.core.Is.`is`
import org.junit.Assert
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import javax.inject.Inject


class DaggerInjectionKotlinTest {

    @Inject lateinit var injected: InjectedClassImpl
    val debugValue = "debugValue"

    @Before fun setup() {
        DaggerTestComponent.builder()
                .myModule(MyModule(debugValue))
                .build()
                .inject(this)
    }

    @Test
    fun dagger_injects_with_debug_module() {
        assertThat(injected.dependency.value, `is`(debugValue))
    }

}
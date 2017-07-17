package ru.avito.api;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import javax.inject.Inject;

import it.cosenonjaviste.daggermock.DaggerMockRule;

import static org.junit.Assert.*;

public class PlainJavaUnitTest {

    @Inject InjectedClassImpl injected;

    String debugValue = "debugValue";

    @Before public void setup() {
        DaggerTestComponent.builder()
                .myModule(new MyModule(debugValue))
                .build()
                .inject(this);
    }

    @Test
    public void injection_isCorrect() throws Exception {
        assertEquals(injected.getDependency().getValue(), debugValue);
    }
}
package com.nhnent.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    Hello hello;

    @Before
    public void before() {
        hello = new Hello();
    }

    @Test
    public void testMessage() throws Exception {
        assertEquals("Hello", hello.getHelloMessage());
    }
}

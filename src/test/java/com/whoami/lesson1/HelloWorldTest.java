package com.whoami.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void shouldSayHello() {

        String text = HelloWorld.sayHello();
        Assertions.assertEquals("Hello, World!", text);
    }
}
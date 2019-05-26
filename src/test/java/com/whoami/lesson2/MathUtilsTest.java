package com.whoami.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void shouldSumTwoNumbers() {
        int res = MathUtils.add(3, 5);
        Assertions.assertEquals(8, res);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int res = MathUtils.mul(3, 3);
        Assertions.assertEquals(9, res);
    }
}
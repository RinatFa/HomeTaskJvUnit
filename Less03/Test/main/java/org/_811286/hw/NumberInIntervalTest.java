package main.java.org._811286.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberInIntervalTest {
    NumberInInterval numberInInterval;

    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    void numberInInterval(int iNumb) {
        assertTrue(numberInInterval.numberInInterval(iNumb));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 25, 100, 150})
    void numberOutInterval(int iNumb) {
        assertFalse(numberInInterval.numberInInterval(iNumb));
    }
}

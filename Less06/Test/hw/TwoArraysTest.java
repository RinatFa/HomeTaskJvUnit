package hw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoArraysTest {

    @Test
    void twoArray() {
        TwoArrays twoArrays = new TwoArrays(Arrays.asList(1.0, 2.0, 3.0),
                Arrays.asList(3.0, 2.0, 1.0));

        String sResult = twoArrays.twoArray();

        assertTrue(sResult.contains("список имеет большее среднее значение") ||
                sResult.contains("Средние значения равны"));
    }
}

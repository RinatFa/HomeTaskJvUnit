package main.java.org._811286.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenOddNumbTest {
    EvenOddNumb evenOddNumb;
    int iOddNumber = 11;
    int iEvenNumber = 12;

    @BeforeEach
    void setUp() {
        evenOddNumb = new EvenOddNumb();
    }

    @Test
    void oddNumber() {
        assertFalse(evenOddNumb.evenOddNumber(iOddNumber));
    }

    @Test
    void evenNumber() {
        assertTrue(evenOddNumb.evenOddNumber(iEvenNumber));
    }
}

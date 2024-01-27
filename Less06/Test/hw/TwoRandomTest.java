package hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoRandomTest {

    @Test
    void twoRand() {
        TwoRandom twoRandom = new TwoRandom(3, 3);

        String sResult = twoRandom.twoRand();

        assertTrue(sResult.contains("список имеет большее среднее значение") ||
                sResult.contains("Средние значения равны"));
    }
}

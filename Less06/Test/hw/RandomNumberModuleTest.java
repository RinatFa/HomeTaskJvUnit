package hw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumberModuleTest {

    @Test
    void randomNumberTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int iSize = 5;

        List<Double> result = randomNumberModule.generateList(iSize);

        assertEquals(iSize, result.size());
    }
}

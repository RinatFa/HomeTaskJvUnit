package hw;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TwoRandom twoRandom = new TwoRandom(5, 7);
        System.out.println(twoRandom.twoRand());

        List<Double> list3 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> list4 = Arrays.asList(2.0, 3.0, 4.0, 5.0, 1.0);
        TwoArrays twoArrays = new TwoArrays(list3, list4);
        System.out.println(twoArrays.twoArray());

    }
}

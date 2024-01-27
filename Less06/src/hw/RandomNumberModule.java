package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberModule {
    private Random random = new Random();

    public List<Double> generateList(int size) {
        List<Double> aDoubles = new ArrayList<>();
        double min = 1.0;
        double max = 10.0;
        double rand;
        String sStr;

        for (int i = 0; i < size; i++) {
            rand = this.random.nextDouble() * (max - min) + min;
            sStr = String.format("%.5s", rand);
            aDoubles.add(Double.valueOf(sStr));
        }
        return aDoubles;
    }
}

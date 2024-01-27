package hw;

import java.util.List;

public class TwoRandom {
    int dim1 = 3;
    int dim2 = 3;

    public TwoRandom(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public String twoRand() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        List<Double> list1 = randomNumberModule.generateList(dim1);
        List<Double> list2 = randomNumberModule.generateList(dim2);
        String sStr = "\nСписок 1: " + list1 + "\nСписок 2: " + list2 + "\n";

        TwoLists twoLists = new TwoLists(list1, list2);
        String sAver1 = String.format("%.3f", twoLists.averageValueList1());
        String sAver2 = String.format("%.3f", twoLists.averageValueList2());
        sStr += twoLists.comparisonAverages() + " >> " + sAver1 + " vs " + sAver2;

        return sStr;
    }
}

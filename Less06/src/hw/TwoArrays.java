package hw;

import java.util.List;

public class TwoArrays {
    List<Double> list3;
    List<Double> list4;

    public TwoArrays(List<Double> list3, List<Double> list4) {
        this.list3 = list3;
        this.list4 = list4;
    }

    public String twoArray() {
        String sStr = "\nСписок 3: " + list3 + "\nСписок 4: " + list4 + "\n";

        TwoLists twoLists2 = new TwoLists(list3, list4);
        String sAver3 = String.format("%.3f", twoLists2.averageValueList1());
        String sAver4 = String.format("%.3f", twoLists2.averageValueList2());
        sStr += twoLists2.comparisonAverages() + " >> " + sAver3 + " = " + sAver4;

        return sStr;
    }
}

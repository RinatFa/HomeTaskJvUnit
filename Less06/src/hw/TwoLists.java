package hw;

import java.util.List;

public class TwoLists {
    List<Double> list1;
    List<Double> list2;

    public TwoLists(List<Double> list1, List<Double> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public Double averageValueList1() {
        double avr = 0;
        for (int i = 0; i < list1.size(); i++) {
            avr += list1.get(i);
        }
        avr /= list1.size();
        return avr;
    }

    public Double averageValueList2() {
        double avr = 0;
        for (int i = 0; i < list2.size(); i++) {
            avr += list2.get(i);
        }
        avr /= list2.size();
        return avr;
    }

    public String comparisonAverages() {
        double d1 = averageValueList1();
        double d2 = averageValueList2();
        String sStr;
        if (d1 > d2) {
            sStr = "\"Первый список имеет большее среднее значение\"";
        } else if (d1 < d2) {
            sStr = "\"Второй список имеет большее среднее значение\"";
        } else {
            sStr = "\"Средние значения равны\"";
        }
        return sStr;
    }
}

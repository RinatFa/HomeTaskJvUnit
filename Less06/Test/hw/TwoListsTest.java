package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoListsTest {
    List<Double> listOne;
    List<Double> listTwo;
    List<Double> listThree;
    TwoLists twoLists;
    TwoLists twoListsMore;
    TwoLists twoListsLess;
    double result;
    double expected;

    @BeforeEach
    void setUp() {
        listOne = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        listTwo = Arrays.asList(2.0, 3.0, 4.0, 5.0, 1.0);
        listThree = Arrays.asList(5.0, 6.0, 7.0, 8.0, 9.0);
        twoLists = new TwoLists(listOne, listTwo);
        twoListsMore = new TwoLists(listThree, listTwo);
        twoListsLess = new TwoLists(listOne, listThree);
    }

    @Test
    void averageValueList1() {
        result = twoLists.averageValueList1();
        expected = listOne.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        assertEquals(expected, result);
    }

    @Test
    void averageValueList2() {
        result = twoLists.averageValueList2();
        expected = listTwo.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        assertEquals(expected, result);
    }

    @Test
    void comparisonAveragesEqual() {
        String sCompar = twoLists.comparisonAverages();

        assertEquals("\"Средние значения равны\"", sCompar);
    }

    @Test
    void comparisonAveragesMore() {
        String sCompar = twoListsMore.comparisonAverages();

        assertEquals("\"Первый список имеет большее среднее значение\"", sCompar);
    }

    @Test
    void comparisonAveragesLess() {
        String sCompar = twoListsLess.comparisonAverages();

        assertEquals("\"Второй список имеет большее среднее значение\"", sCompar);
    }
}

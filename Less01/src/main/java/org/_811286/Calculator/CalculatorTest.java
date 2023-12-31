package main.java.org._811286.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Сумма покупки без скидки : " +
                Calculator.calculatingDiscount(1000.0, 0));
        System.out.println("Сумма покупки со скидкой 15% : " +
                Calculator.calculatingDiscount(1000.0, 15));
        System.out.println("Сумма покупки со скидкой 100% : " +
                Calculator.calculatingDiscount(1000.0, 100));

        assertThat(Calculator.calculatingDiscount(1000.0, 15)).isEqualTo(850.0);
        System.out.println("Успешная проверка на размер скидки 15%");
        assertThat(Calculator.calculatingDiscount(1000.0, 100)).isEqualTo(0.0);
        System.out.println("Успешная проверка на размер скидки 100%");
        assertThat(Calculator.calculatingDiscount(1000.0, 0)).isEqualTo(1000.0);
        System.out.println("Успешная проверка на размер скидки 0%");
        assertThat(Calculator.calculatingDiscount(0.0, 0)).isEqualTo(0.0);
        System.out.println("Успешная проверка на сумму покупки 0 и размер скидки 0%");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1000.0, 15)
        ).isInstanceOf(ArithmeticException.class);
        System.out.println("Успешная проверка на отрицательную сумму покупки -1000");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000.0, 115)
        ).isInstanceOf(ArithmeticException.class);
        System.out.println("Успешная проверка на превышение размера скидки 115%");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000.0, -15)
        ).isInstanceOf(ArithmeticException.class);
        System.out.println("Успешная проверка на отрицательный размер скидки -15%");
        System.out.println();
    }
}

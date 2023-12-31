package main.java.org._811286.Shop;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
 * (правильное количество продуктов, верное содержимое корзины).
 * 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
 * 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice
 * (проверьте правильность сортировки).
 */
public class ShopTest {
    public static void main(String[] args) {
        Product cottagecheese = new Product(75, "Творог");
        Product sourcream = new Product(85, "Сметана");
        Product yogurt = new Product(45, "Йогурт");
        List<Product> prodShop = new ArrayList<>();
        prodShop.add(cottagecheese);
        prodShop.add(sourcream);
        prodShop.add(yogurt);
        Shop shop = new Shop(prodShop);

        System.out.println();
        System.out.println(shop.toString());
        System.out.println(shop.getMostExpensiveProduct(prodShop));
        System.out.println("    После сортировки корзины по цене:");
        shop.sortProductsByPrice(prodShop);
        System.out.println(shop.toString());

        assertThat(shop.getProducts())
                .hasSize(3)
                .contains(cottagecheese, yogurt, sourcream);
        System.out.println("Успешная проверка на количество продуктов и содержимого корзины");

        assertThat(shop.getProducts()).containsSequence(yogurt, cottagecheese, sourcream);
        System.out.println("Успешная проверка правильности сортировки");

        assertThat(shop.getMostExpensiveProduct(prodShop).getCost()).isEqualTo(85);
        System.out.println("Успешная проверка определения самого дорогого продукта");
        System.out.println();
    }
}

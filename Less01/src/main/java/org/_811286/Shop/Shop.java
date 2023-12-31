package main.java.org._811286.Shop;

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> sortProductsByPrice(List<Product> products) {
        Collections.sort(products);
        return products;
    }

    public Product getMostExpensiveProduct(List<Product> products) {
        Product product = Collections.max(products);
        return product;
    }
}

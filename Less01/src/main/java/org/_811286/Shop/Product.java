package main.java.org._811286.Shop;

public class Product implements Comparable<Product> {
    private Integer cost;
    private String title;

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(getCost(), o.getCost());
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
package Ejercicio4;

public class Product {
    private String name;
    private String description;
    private int cost;
    private int stock;

    public Product(String name, String description, int cost, int stock) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

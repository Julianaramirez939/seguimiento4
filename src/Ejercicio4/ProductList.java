package Ejercicio4;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printProductDetails() {
        for (Product product : products) {
            System.out.println("Nombre: " + product.getName());
            System.out.println("Descripción: " + product.getDescription());
            System.out.println("Costo: " + product.getCost());
            System.out.println("Stock: " + product.getStock());


            if (product.getClass() == ProductoPredecedero.class) {
                ProductoPredecedero perecedero = (ProductoPredecedero) product;
                System.out.println("Fecha de Vencimiento: " + perecedero.getFechaVencimiento());
            }

            System.out.println("Producto verificado");
        }
    }
}

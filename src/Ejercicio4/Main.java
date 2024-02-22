package Ejercicio4;

    public class Main {
        public static void main(String[] args) {

            ProductList productList = new ProductList();


            Product producto1 = new Product("Huevos", "Huevos de gallina", 40, 50);
            ProductoPredecedero producto2 = new ProductoPredecedero("Limones", "Limon mandarino", 5, 30, "2025-01-15");
            productList.addProduct(producto1);
            productList.addProduct(producto2);


            System.out.println("Detalles de los productos:");
            productList.printProductDetails();


            producto1.setCost(55);
            producto2.setDescription("Limon pajarito");


            System.out.println("\nDetalles después de la modificación:");
            productList.printProductDetails();


            productList.removeProduct(producto1);


            System.out.println("\nDetalles después de eliminar un producto:");
            productList.printProductDetails();
        }
    }


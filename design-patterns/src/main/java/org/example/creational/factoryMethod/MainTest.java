package org.example.creational.factoryMethod;

public class MainTest {

    public static void main(String[] args) {

        Category category = new Digital();
        Product product = category.newProduct();

        System.out.println(product);

        category = new Physical();
        product = category.newProduct();

        System.out.println(product);
    }
}

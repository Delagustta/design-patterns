package org.example.creational.factoryMethod;

public class Digital implements Category {

    @Override
    public Product newProduct() {
        return new DigitalProduct();
    }
}

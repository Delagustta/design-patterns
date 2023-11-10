package org.example.creational.factoryMethod;

public class Physical implements Category {

    @Override
    public Product newProduct() {
        return new PhysicalProduct();
    }
}

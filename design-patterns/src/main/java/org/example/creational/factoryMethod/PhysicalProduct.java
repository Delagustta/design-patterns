package org.example.creational.factoryMethod;

public class PhysicalProduct implements Product {

    String name;

    public PhysicalProduct() {
        name = "Batman Arkham Knight";
    }

    @Override
    public String toString() {
        return "PhysicalProduct{" +
                "name='" + name + '\'' +
                '}';
    }
}

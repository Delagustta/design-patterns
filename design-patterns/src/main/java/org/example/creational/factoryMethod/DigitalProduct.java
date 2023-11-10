package org.example.creational.factoryMethod;

public class DigitalProduct implements Product {

    String name;

    public DigitalProduct() {
        name = "Call of Duty 3";
    }

    @Override
    public String toString() {
        return "DigitalProduct{" +
                "name='" + name + '\'' +
                '}';
    }
}

package FactoryMethod.products;

import FactoryMethod.ShoeStyle;

/**
 * Abstract class that represents the idea of the product in the Factory Design Pattern. It implements the Shoe interface
 * It has a name.
 */
public abstract class AbstractShoe implements Shoe {

    protected String name;
    protected ShoeStyle style;


    @Override
    public void getMaterials() {
        System.out.println("Collecting and cutting Materials");
    }


    @Override
    public void assembleShoe() {
        System.out.println("Sewing Materials");
    }

    @Override
    public void packageShoe() {
        System.out.println("Packaging your new shoes");
    }

    public String getName() {
        return name;
    }
}

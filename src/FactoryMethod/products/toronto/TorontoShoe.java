package FactoryMethod.products.toronto;

import FactoryMethod.products.AbstractShoe;

/**
 * Abstract class that represent Shoes made in Toronto. It extends the AbstractShoe class.
 */
public class TorontoShoe extends AbstractShoe {

    @Override
    public void getMaterials() {
        System.out.println("Getting warmer Materials");
        super.getMaterials();
    }

    @Override
    public void assembleShoe() {
        System.out.println("Assembling your Shoes, while the Toronto Raptors are playing!");
    }

    @Override
    public void packageShoe() {
        System.out.println("Packing with hot Cocoa love, cause Its a Toronto Winter Night.");
    }
}

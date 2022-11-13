package FactoryMethod.products.vancouver;

import FactoryMethod.products.AbstractShoe;

/**
 * Abstract class that represent Shoes made in Vancouver. It extends the AbstractShoe class.
 */
public abstract class VancouverShoe extends AbstractShoe {

    @Override
    public void getMaterials() {
        System.out.println("Getting waterproofing materials");
        super.getMaterials();
    }

    @Override
    public void assembleShoe() {
        System.out.println("Assembling your Shoes. While we wish to be at whistler! Still we love you");
    }

    @Override
    public void packageShoe() {
        System.out.println("Packing your shoes. I hope it is ready before it starts to rain... sorry, too late");
    }

}

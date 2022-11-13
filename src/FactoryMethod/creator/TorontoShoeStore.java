package FactoryMethod.creator;

import FactoryMethod.ShoeStyle;
import FactoryMethod.products.Shoe;
import FactoryMethod.products.toronto.TorontoHikingBoot;
import FactoryMethod.products.toronto.TorontoRunningShoe;
import FactoryMethod.products.toronto.TorontoSandal;
import FactoryMethod.products.toronto.TorontoSneaker;

public class TorontoShoeStore extends ShoeStore {

    /**
     * Creates a specific shoe subclass depending on the style being ordered by a client
     * @param style The style of shoe to create
     * @return the shoe type to create
     */
    public Shoe createShoe(ShoeStyle style){
        Shoe shoe;

        switch (style) {
            case HIKING:
                shoe = new TorontoHikingBoot();
                break;
            case RUNNER:
                shoe = new TorontoRunningShoe();
                break;
            case CASUAL:
                shoe = new TorontoSneaker();
                break;
            case SUMMER:
                shoe = new TorontoSandal();
            default:
                shoe = null;
        }

        return shoe;
    }
}

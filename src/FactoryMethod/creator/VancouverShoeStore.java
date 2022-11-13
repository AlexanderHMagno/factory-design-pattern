package FactoryMethod.creator;

import FactoryMethod.ShoeStyle;
import FactoryMethod.products.Shoe;
import FactoryMethod.products.vancouver.VancouverHikingBoot;
import FactoryMethod.products.vancouver.VancouverRunningShoe;
import FactoryMethod.products.vancouver.VancouverSandal;
import FactoryMethod.products.vancouver.VancouverSneaker;

public class VancouverShoeStore extends ShoeStore {

    /**
     * Creates a specific shoe subclass depending on the style being ordered by a client
     * @param style The style of shoe to create
     * @return the shoe type to create
     */
    public Shoe createShoe(ShoeStyle style){
        Shoe shoe;

        switch (style) {
            case HIKING:
                shoe = new VancouverHikingBoot();
                break;
            case RUNNER:
                shoe = new VancouverRunningShoe();
                break;
            case CASUAL:
                shoe = new VancouverSneaker();
                break;
            case SUMMER:
                shoe = new VancouverSandal();
            default:
                shoe = null;
        }

        return shoe;
    }
}

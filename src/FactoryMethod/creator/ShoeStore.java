package FactoryMethod.creator;

import FactoryMethod.ShoeStyle;
import FactoryMethod.products.Shoe;

/**
 * A basic class representation of a ShoeStore. The store is the client of the SimpleShoeFactory
 * which it takes as a parameter to determine which shoe will be made when an order is placed
 */
public abstract class ShoeStore {

  /**
   * A method to fill a shoe order. Calls our factory to determine the shoe subclass to call,
   * retrieves shoe materials, assembles the shoe and packages it
   * @param style The style of shoe to create
   * @return The packaged shoe
   */
  public Shoe orderShoe(ShoeStyle style){
    Shoe shoe;

    shoe = createShoe(style);
    shoe.getMaterials();
    shoe.assembleShoe();
    shoe.packageShoe();

    return shoe;
  }

  abstract Shoe createShoe(ShoeStyle type) ;
}


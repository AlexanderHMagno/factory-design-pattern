package SimpleFactoryMethod;

/**
 * A basic class representation of a ShoeStore. The store is the client of the SimpleShoeFactory
 * which it takes as a parameter to determine which shoe will be made when an order is placed
 */
public class ShoeStore {

  private final SimpleShoeFactory factory;

  /**
   * The ShoeStore constructor. It is composed of a factory, the SimpleShoeFactory, which creates
   * a given type of shoe
   * @param factory The factory we call to create the shoe
   */
  public ShoeStore(SimpleShoeFactory factory){
    this.factory = factory;
  }

  /**
   * A method to fill a shoe order. Calls our factory to determine the shoe subclass to call,
   * retrieves shoe materials, assembles the shoe and packages it
   * @param style The style of shoe to create
   * @return The packaged shoe
   */
  public Shoe orderShoe(ShoeStyle style){
    Shoe shoe;

    shoe = factory.createShoe(style);
    shoe.getMaterials();
    shoe.assembleShoe();
    shoe.packageShoe();

    return shoe;
  }
}


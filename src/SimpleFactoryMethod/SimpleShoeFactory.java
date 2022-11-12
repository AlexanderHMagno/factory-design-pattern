package SimpleFactoryMethod;

/**
 * A class representation of a simple shoe factory. The factory determines which shoe subclass gets
 * called when an order is placed at a shoe store
 */
public class SimpleShoeFactory {

  /**
   * Creates a specific shoe subclass depending on the style being ordered by a client
   * @param style The style of shoe to create
   * @return the shoe type to create
   */
  public Shoe createShoe(ShoeStyle style){
    Shoe shoe = null;
    if (style.equals(ShoeStyle.HIKING)){
      shoe = new HikingBoot();
    }
    else if (style.equals(ShoeStyle.RUNNER)){
      shoe = new RunningShoe();
    }
    else if (style.equals(ShoeStyle.CASUAL)){
      shoe = new Sneaker();
    }
    else if (style.equals(ShoeStyle.SUMMER)){
      shoe = new Sandal();
    }
    return shoe;
  }
}


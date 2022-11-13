package FactoryMethod;

import FactoryMethod.creator.ShoeStore;
import FactoryMethod.creator.TorontoShoeStore;
import FactoryMethod.creator.VancouverShoeStore;
import FactoryMethod.products.Shoe;

/**
 * This class represents the Driver that starts running our factory.
 */
public class JJXTestDriver {

    public static void main(String[] args) {

        ShoeStore VcStore = new VancouverShoeStore();
        ShoeStore TrStore = new TorontoShoeStore();

        Shoe example = VcStore.orderShoe(ShoeStyle.RUNNER);
        System.out.println("\nJing Ordered " + example.getName() + "\n");

        Shoe example2 = TrStore.orderShoe(ShoeStyle.HIKING);
        System.out.println("\nJordan Ordered " + example2.getName() + "\n");

        Shoe example3 = TrStore.orderShoe(ShoeStyle.CASUAL);
        System.out.println("\nAlex Ordered " + example3.getName() + "\n");
        example3 = VcStore.orderShoe(ShoeStyle.CASUAL);
        System.out.println("\nAlex Ordered " + example3.getName() + "\n");


    }
}

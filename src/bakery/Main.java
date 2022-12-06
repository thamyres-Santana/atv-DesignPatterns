
/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(
                new WithSayingCake(
                        new VanillaCake(),
                        "PLAIN!"));
        order.addCake(
                new WithSayingCake(
                        new SprinklesCake(
                                new VanillaCake()),
                        "FANCY"));
        order.addCake(
                new WithSayingCake(
                        new WithSayingCake(
                                new SprinklesCake(
                                        new SprinklesCake(
                                                new StrawberryCake(
                                                        new MultiLayeredCake()))),
                                "One of"),
                        "EVERYTHING"));

        // Print the order
        order.printOrder();

    }

}

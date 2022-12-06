
public class SprinklesCake extends DecoratorCake {
    private final int COST = 2;

    public SprinklesCake() {

    }

    public SprinklesCake(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with sprinkles ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + COST;
    }
}

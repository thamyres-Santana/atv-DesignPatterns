
public class MultiLayeredCake extends DecoratorCake {

    private final int COST = 5;

    public MultiLayeredCake() {

    }

    public MultiLayeredCake(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return "Multi-layered";
    }

    @Override
    public int getCost() {
        return cake.getCost() + COST;
    }
}

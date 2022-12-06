
public class VanillaCake extends DecoratorCake {

    public VanillaCake() {
        super();
    }

    public VanillaCake(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "Vanilla cake ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + super.getCost();
    }
}

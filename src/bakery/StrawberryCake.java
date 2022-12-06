
public class StrawberryCake extends DecoratorCake {

    public StrawberryCake() {
        super();
    }

    public StrawberryCake(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "Strawberry cake ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + (super.getCost() * 2);
    }
}

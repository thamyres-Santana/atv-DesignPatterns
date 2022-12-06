public class ChocolateCake extends DecoratorCake {

    public ChocolateCake() {
        super();
    }

    public ChocolateCake(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "Chocolate cake ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + super.getCost();
    }
}
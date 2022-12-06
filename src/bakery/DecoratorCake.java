public abstract class DecoratorCake extends Cake {

    protected Cake cake;

    public DecoratorCake() {
        this.cake = new Cake() {

            @Override
            public String getDescription() {
                return "";
            }

            @Override
            public int getCost() {
                return 0;
            }
        };
    }

    public DecoratorCake(Cake cake) {
        this.cake = cake;
    }
}

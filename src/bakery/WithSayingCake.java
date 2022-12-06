
public class WithSayingCake extends DecoratorCake {

    private String saying;

    public WithSayingCake(String saying) {
        super();
        this.saying = saying;
    }

    public WithSayingCake(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with saying '" + this.saying + "' ";
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }
}

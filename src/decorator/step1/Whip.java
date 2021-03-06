package decorator.step1;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}

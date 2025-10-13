package structuralPatterns.decorattorPattern;

public class Cappuccino extends BeverageDecorator{

    public Cappuccino(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sum up the cost of the base beverage and the cost of cappuccino
        return beverage.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " cappuccino";
    }
}

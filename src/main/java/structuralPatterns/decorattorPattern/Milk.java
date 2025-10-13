package structuralPatterns.decorattorPattern;

public class Milk extends BeverageDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sum up the cost of the base beverage and the cost of milk
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk";
    }
}

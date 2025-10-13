package structuralPatterns.decorattorPattern;

public class PlainBeverage implements Beverage{
    @Override
    public int getCost() {
        // Basic beverage cost
        return 5;
    }

    @Override
    public String getDescription() {
        return "";
    }
}

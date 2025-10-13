package structuralPatterns.decorattorPattern;

public class App {

    public static void main(String[] args) {

        Beverage beverage = new Cappuccino(new Sugar(new Sugar(new Milk(new PlainBeverage()))));
        System.out.println("Cost: " + beverage.getCost() + "; Description: " + beverage.getDescription());
    }
}

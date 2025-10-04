package creationalPatterns.abstractFactoryPattern;

public class App {

    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("PETROL");
        factory.getCar("TOYOTA").assmeble();
    }
}

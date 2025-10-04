package creationalPatterns.factoryPattern;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating ...");
    }
}

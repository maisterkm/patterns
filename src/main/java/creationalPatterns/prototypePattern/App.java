package creationalPatterns.prototypePattern;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Shape circle = new Circle();
        circle.setHeight(10);
        circle.setWidth(20);
        circle.setColor("Green");

        System.out.println(circle);

        Shape circle2 = circle.clone();
        circle2.setColor("Blue");

        System.out.println(circle2);
    }
}

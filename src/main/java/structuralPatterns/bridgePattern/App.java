package structuralPatterns.bridgePattern;

public class App {

    public static void main(String[] args) {

        Shape s1 = new Circle(new VectorRendorer());
        Shape s2 = new Square(new VectorRendorer());
        Shape s3 = new Circle(new RasterRenderer());

        s1.draw();
        s2.draw();
        s3.draw();
    }

}

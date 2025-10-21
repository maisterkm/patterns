package structuralPatterns.bridgePattern;

public class Circle extends Shape {

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        this.renderer.render("CIRCLE");
    }
}

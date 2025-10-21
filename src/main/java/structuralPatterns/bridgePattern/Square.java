package structuralPatterns.bridgePattern;

public class Square extends Shape {

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        this.renderer.render("SQUARE");
    }
}

package structuralPatterns.bridgePattern;

//concreter implementer
public class VectorRendorer implements Renderer{

    @Override
    public void render(final String shape) {
        System.out.println("Vector rendering: " + shape);
    }
}

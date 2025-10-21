package structuralPatterns.bridgePattern;

public class RasterRenderer implements Renderer {

    @Override
    public void render(final String shape) {
        System.out.println("Raster rendering: " + shape);
    }
}

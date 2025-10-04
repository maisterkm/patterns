package creationalPatterns.prototypePattern;

public abstract class Shape implements Cloneable {

    private int width;
    private int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + this.width + " - " + this.height + " - " + this.color;
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}

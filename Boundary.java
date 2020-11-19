import java.awt.Color;

public class Boundary extends LineSegment {

    private Color color;

    public Boundary(Vector start, Vector finish) {
        this(start, finish, Color.white);
    }

    public Boundary(Vector start, Vector finish, Color color) {
        super(start, finish);
        this.color = color;
    }

    public static Boundary random(float xMin, float xMax, float yMin, float yMax) {
        Vector start = Vector.random(xMin, xMax, yMin, yMax);
        Vector finish = Vector.random(xMin, xMax, yMin, yMax);
        Color color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
        return new Boundary(start, finish, color);
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}

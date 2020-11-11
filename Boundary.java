import java.awt.Color;

public class Boundary extends LineSegment {

    private Color color;

    public Boundary(Vector start, Vector finish, Color color) {
        super(start, finish);
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

import java.awt.Graphics;

public class Game {

    public Game() {
        LineSegment testLine = new LineSegment(new Vector(0, 10), new Vector(10, 10));
        Ray testRay = new Ray(new Vector(5, 0), new Vector(0, 1));
        Vector intersection = testRay.getIntersection(testLine);
        System.out.println(intersection);
        System.out.println(intersection.x);
    }

    public void update(float deltaTime) {

    }

    public void render(float deltaTime, Graphics g) {

    }
    
}
public class Ray {
    Vector position, direction;

    public Ray(Vector position, Vector direction) {
        this.position = position;
        this.direction = direction.normalized();
    }

    public Vector getIntersection(LineSegment line) {
        if (line.containsPoint(position)) {
            return position;
        }
        
        const float x1 = line.position.x, y1 = line.position.y;
        const float x2 = l
    }
}

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
        
        Vector slope = line.getParametricSlope();
        if (!slope.willIntersect(direction)) {
            return null;
        }
        
        // This is incorrect
        final float x = direction.x * (line.start.x - position.x) / (direction.x - slope.x) + position.x;
        final float y = direction.y * (line.start.y - position.y) / (direction.y - slope.y) + position.y;
        return new Vector(x, y);
    }
}

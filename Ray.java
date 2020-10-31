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
        if (slope.parallel(direction)) {
            return null;
        }

        if (slope.x == 0) {
            // Vertical and non vertical
        } else if (slope.y == 0) {
            //

        } else if (direction.x == 0) {

        } else if (direction.y == 0) {

        } else {

        }
    }
}

public class Ray {

    Vector position, direction;

    public Ray(Vector position, Vector direction) {
        this.position = position;
        this.direction = direction.normalized();
    }

    public void pointTo(Vector location) {
        direction.x = location.x - position.x;
        direction.y = location.y - position.y;
    }

    public Vector getIntersection(LineSegment line) {
        if (line.containsPoint(position)) {
            return position;
        }
        
        final float x1 = position.x, y1 = position.y;
        final float x2 = x1 + direction.x, y2 = y1 + direction.y;
        final float x3 = line.start.x, y3 = line.start.y;
        final float x4 = line.finish.x, y4 = line.finish.y;

        final float denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denominator == 0) {
            return null;
        }
        
        final float t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
        final float x = position.x + t * direction.x;
        final float y = position.y + t * direction.y;

        return new Vector(x, y);
    }

    public float distanceTo(LineSegment line) {
        Vector intersection = getIntersection(line);
        if (intersection == null) {
            return -1;
        }
        return intersection.distanceTo(position);
    }

}

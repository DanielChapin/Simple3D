public class LineSegment {
    public Vector start, finish;

    public LineSegment(Vector start, Vector finish) {
        if (start.x > finish.y) {
            this.start = finish;
            this.finish = start;
        } else {
            this.start = start;
            this.finish = finish;
        }
    }

    public Vector getParametricSlope() {
        return new Vector(finish.x - start.x, finish.y - start.y);
    }

    public float getSlope() {
        return (float) (finish.y - start.x) / (finish.x - start.x);
    }

    public boolean containsPoint(Vector p) {
        if (p.x >= start.x && p.x <= finish.x) {
            final float dx = p.x - start.x;
            return dx * getSlope() + start.y == p.y;
        }

        return false;
    }
}
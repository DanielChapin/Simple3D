public class Vector {
    public float x, y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector(Vector v) {
        x = v.x;
        y = v.y;
    }

    public void scale(float factor) {
        x *= factor;
        y *= factor;
    }

    public float length() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector normalized() {
        Vector v = new Vector(this);
        v.scale(1.0f / length());
        return v;
    }

    public boolean parallel(Vector v) {
        Vector a = this.normalized();
        Vector b = v.normalized();

        return (a.x == b.x && a.y == b.y) || (a.x == -b.x && a.y == -b.y);
    }
    
    // This is incorrect. This makes t a determining factor which is incorrect.
    public boolean willIntersect(Vector v) {
        Vector a = this.normalized();
        Vector b = v.normalized();

        return (Math.abs(a.x) != Math.abs(b.x)) && (Math.abs(a.y) != Math.abs(b.y));
    }
}

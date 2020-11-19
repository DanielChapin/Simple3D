public class Vector {
    public float x, y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector(float x) {
        this(x, x);
    }

    public static Vector fromAngle(float theta) {
        return new Vector((float) Math.cos(theta), (float) Math.sin(theta));
    }

    public static Vector random(float xMax, float yMax) {
        return new Vector((float) (Math.random() * xMax), (float) (Math.random() * yMax));
    }

    public Vector(Vector v) {
        x = v.x;
        y = v.y;
    }

    @Override
    public String toString() {
        return "{" + Float.toString(x) + ", " + Float.toString(y) + "}";
    }

    public void scale(float factor) {
        x *= factor;
        y *= factor;
    }

    public Vector scaled(float factor) {
        Vector vec = new Vector(this);
        vec.scale(factor);
        return vec;
    }

    public void rotate(float theta) {
        x = (float) (x * Math.cos(theta));
        y = (float) (y * Math.sin(theta));
    }

    public Vector rotated(float theta) {
        Vector vec = new Vector(this);
        vec.rotate(theta);
        return vec;
    }

    public void translate(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public Vector translated(float x, float y) {
        Vector vector = new Vector(this);
        vector.translate(x, y);
        return vector;
    }

    public void translate(Vector translation) {
        translate(translation.x, translation.y);
    }

    public Vector translated(Vector translation) {
        Vector vector = new Vector(this);
        vector.translate(translation);
        return vector;
    }

    public float length() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public float distanceTo(Vector v) {
        return (float) Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2));
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

}

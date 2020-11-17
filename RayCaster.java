public class RayCaster {

    public Vector position;
    public float fov;
    public int numRays;
    
    public RayCaster(Vector position, float fov, int numRays) {
        this.position = position;
        this.fov = fov;
        this.numRays = numRays;
    }

}

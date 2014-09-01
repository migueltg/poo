package utils;

public class Point3D extends TimePoint {
    private int z;

    public Point3D(int x, int y, int z, int t) {
        super(x, y, t);
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public double module() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
    }
}

package utils;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (obj == null || this.getClass() != obj.getClass()) {
            result = false;
        } else {
            final Point otro = (Point) obj;
            result = otro.getX() == this.x && otro.getY() == this.y;
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + this.x;
        result = prime * result + this.y;
        return result;
    }

}

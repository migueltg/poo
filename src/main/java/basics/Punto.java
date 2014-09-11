package basics;

public class Punto {
    private int x, y;

    public Punto(int x, int y) {
    }

    public Punto() {
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public double modulo() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public void desplazarX(int despX) {
    }

    public void desplazarY(int despY) {
    }

    public void sumar(Punto otro) {

    }

    public boolean mismoCuadrante(Punto otro) {
        return false;
    }

    public int cuadrante() { // 1, 2, 3 y 4
        return 0;
    }

    public int coordenadaMayor() { // 0 es X, 1 es Y
        return 0;
    }

    @Override
    public String toString() {
        return "Punto[" + x + "," + y + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;

        return (x == other.x && y == other.y);
    }

}

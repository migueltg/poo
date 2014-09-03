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

    public void desplazarX(int valor) {
    }

    public void sumar(Punto otro) {

    }

    public boolean mismoCuadrante(Punto otro) {
        return false;
    }

    public int cuadrante() {
        return x;
    }

    public int coordenadaMayor() {
        return 0;
    }
}

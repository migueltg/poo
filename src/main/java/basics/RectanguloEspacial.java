package basics;

public class RectanguloEspacial {
    private int base, altura;

    private Point posicion;

    public RectanguloEspacial(int base, int altura, Point posicion) {
        this.base = base;
        this.altura = altura;
        this.posicion = posicion;
    }

    public RectanguloEspacial() {
        this(1, 1, new Point());
    }

    public RectanguloEspacial(int base, int altura) {
        this(base, altura, new Point());
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Point getPosicion() {
        return posicion;
    }



}

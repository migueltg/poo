package basics;

public class RectanguloEspacial {
    private int base, altura;

    private Punto posicion;

    public RectanguloEspacial(int base, int altura, Punto posicion) {
        this.base = base;
        this.altura = altura;
        this.posicion = posicion;
    }

    public RectanguloEspacial() {
        this(1, 1, new Punto());
    }

    public RectanguloEspacial(int base, int altura) {
        this(base, altura, new Punto());
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Punto getPosicion() {
        return posicion;
    }



}

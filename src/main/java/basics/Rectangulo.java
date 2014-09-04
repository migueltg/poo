package basics;

public class Rectangulo {
    private int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this(0, 0);
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    public int area() {
        return this.base * this.altura;
    }

    public int perimetro() {
        return 2 * (this.base + this.altura);
    }

    public boolean isCuadrado() {
        return this.base == this.altura;
    }

    public void voltear() {
        int baseAntigua = this.base;
        this.base = this.altura;
        this.altura = baseAntigua;
    }

    public void doblar() {
        this.aumentar(2);
    }

    public void aumentar(int multiplicador) {
        this.base *= multiplicador;
        this.altura *= multiplicador;
    }

    public void fusionar(Rectangulo otro) {
        this.base = this.base + otro.getBase();
        this.altura += otro.getAltura();
    }

    public int ladoEstrecho() {
        if (this.base < this.altura) {
            return this.base;
        } else {
            return this.altura;
        }
    }

    public int ladoAncho() {
        if (this.base > this.altura) {
            return this.base;
        } else {
            return this.altura;
        }
    }

}
